package LuSQL.logica;

import java.util.List;
import LuSQL.logica.Interfaces.BaseDatos;
import LuSQL.logica.Interfaces.Tabla;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    public boolean crearNuevaTabla(Tabla tabla) {
        return false;
    }

    @Override
    public boolean eliminarTabla(String nombreTabla) {
        return false;
    }

    @Override
    public void ejecutarSentencia(String sentencia) throws SQLException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tabla ejecutarConsulta(String consulta) {
        return null;
    }

    @Override
    public ServidorSQL getServidor() {
        return servidor;
    }

   //Metodos privados
    private DatabaseMetaData getMetaData() throws SQLException{
        if(metadata==null){
            metadata=servidor.getConexion().getMetaData();
        }
        return metadata;
    }


    
}
