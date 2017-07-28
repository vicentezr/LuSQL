package LuSQL.logica;

import java.util.List;
import LuSQL.logica.Interfaces.BaseDatos;
import LuSQL.logica.Interfaces.Tabla;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Clase que nos permite trabajar con las base de datos de un servidorSQL
 */

  //TODO los métodos de obtener tablas de momento solo funcionan para sqlserver 
public class ConexionBD implements BaseDatos{
    
    private ServidorSQL servidor;
    private DatabaseMetaData metadata;       

    public ConexionBD(ServidorSQL servidor) {
        this.servidor=servidor;        
    }    
     
     @Override
    public List<String> obtenerNombreTablas() throws SQLException {
        List<String> resultado = new ArrayList();
        ResultSet rsTablas = getMetaData().getTables(servidor.getBaseDeDatos(), "dbo", "%", new String[]{"TABLE"});
        while (rsTablas.next()) {
            resultado.add(rsTablas.getString("TABLE_NAME"));
        }
        rsTablas.close();
        return resultado;
    }

    @Override
    public Tabla obtenerTabla(String tabla) throws SQLException {
        Tabla resultado=null;
        ResultSet rsTablas = getMetaData().getTables(servidor.getBaseDeDatos(), "dbo", tabla, new String[]{"TABLE"});
        if (rsTablas.next()) {
            resultado=new ConexionTabla(this, rsTablas.getString("TABLE_NAME"),false);
        }
        rsTablas.close();
        return resultado;
    }

    @Override
    public List<Tabla> obtenerTablas() throws SQLException {
        List<Tabla> resultado = new ArrayList();
        ResultSet rsTablas = getMetaData().getTables(servidor.getBaseDeDatos(), "dbo", "%", new String[]{"TABLE"});
        while (rsTablas.next()) {
            resultado.add(new ConexionTabla(this, rsTablas.getString("TABLE_NAME"),false));
        }
        rsTablas.close();
        return resultado;
    }

    @Override
    public boolean crearNuevaTabla(String nombreTabla,Columna[] columnas) {  
        boolean result;
        Statement statement;
        try {
            String sentenciaSQL="CREATE TABLE "+nombreTabla+
                    " (" + getSentenciaCrearTablaColumnas(columnas) + ");";                                 
            statement=servidor.getConexion().createStatement();
            statement.execute(sentenciaSQL); 
            statement.close();
            result=true;
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());  
            result=false;
        }finally{
            statement=null;
        }
        return result;
    }
    
    private String getSentenciaCrearTablaColumnas(Columna[] columnas){
        String sentenciaColumnas="";         
            for (int i = 0; i < columnas.length; i++) {                
                if(i==columnas.length-1){
                    sentenciaColumnas+=columnas[i].toString();
                }else{
                    sentenciaColumnas+=columnas[i].toString()+",";
                }
            } 
            return sentenciaColumnas;        
    }

    @Override
    public boolean eliminarTabla(String nombreTabla) {
        Statement statement;        
        boolean resultado;
        try {           
            statement=servidor.getConexion().createStatement();
            statement.execute("DROP TABLE "+nombreTabla);
            statement.close();
            resultado=true;
        } catch (Exception ex) {
            resultado=false;
        }finally{
            statement=null;       
        }        
        return resultado;
    }

    @Override
    public void ejecutarSentencia(String sentencia) throws SQLException{        
        Statement statement=servidor.getConexion().createStatement();
        statement.execute(sentencia);
        statement.close();
    }

    @Override
    public Tabla ejecutarConsulta(String consulta) {
        Tabla result=null;
        Statement statement;
        ResultSet rsConsulta;
        ResultSetMetaData rsMetaData;
        try {
            result=new ConexionTabla(this,"Resultado",true);            
            statement=servidor.getConexion().createStatement();
            rsConsulta=statement.executeQuery(consulta);
            rsMetaData = rsConsulta.getMetaData();
            //añadimos columnas y filas a la tabla
            result.setColumnas(getColumnasConsulta(rsMetaData));
            result.setListValores(getValoresConsulta(rsConsulta,result.totalColumnas()));
            statement.close();
            rsConsulta.close();           
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
            result=null;
        }finally{          
            statement=null;
            rsConsulta=null;          
        }
        return result;
    }
    //TODO, solo obtenemos el nombre y tipo de columna, faltan añadir mas datos
    private Columna[] getColumnasConsulta(ResultSetMetaData rsMetaData) throws SQLException{
        Columna[] resultado=new Columna[rsMetaData.getColumnCount()];        
            for (int i = 0; i < resultado.length; i++) {
                resultado[i]=new Columna(rsMetaData.getColumnName(i+1),rsMetaData.getColumnTypeName(i+1));                 
            }
            return resultado;
    }
    
    private List<String[]> getValoresConsulta(ResultSet rsConsulta, int numColumnas) throws SQLException {
        List<String[]> resultado = new ArrayList();
        String valores[];
        while (rsConsulta.next()) {
            valores = new String[numColumnas];
            for (int i = 0; i < numColumnas; i++) {
                valores[i] = rsConsulta.getString(i + 1);
            }
            resultado.add(valores);
        }
        return resultado;
    }

    @Override
    public ServidorSQL getServidor() {
        return servidor;
    }
 
    private DatabaseMetaData getMetaData() throws SQLException{
        if(metadata==null){
            metadata=servidor.getConexion().getMetaData();
        }
        return metadata;
    }


    
}
