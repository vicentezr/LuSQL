package LuSQL.logica;

import LuSQL.logica.Interfaces.BaseDatos;
import LuSQL.logica.Interfaces.Tabla;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que nos permite realizar operaciones sobre una tabla de una base de datos del servidorSQL 
 */
public class ConexionTabla implements Tabla{
    
    private BaseDatos bd; 
    private String nombre;       
    private Columna columnas[]; 
    private List<String[]> listValores;   
    
   /**    
    * @param bd
    * @param nombre : indica el nombre de esta tabla
    * @param vacia
    *        true: indicamos si queremos que acceda a los valores de la base de datos
    *        false: indicamos que queremos una tabla vacia, sin valores.
    */
    public ConexionTabla(BaseDatos bd,String nombre,boolean vacia) {
        this.bd=bd;
        this.nombre=nombre; 
        this.listValores=new ArrayList();        
        if(!vacia){
            cargarDatos();
        }
    } 
    
    private void cargarDatos(){
        Statement statement;
        ResultSet rsFilas;
        ResultSetMetaData rsColumnas;
        try {            
            statement=bd.getServidor().getConexion().createStatement();
            rsFilas=statement.executeQuery("SELECT * FROM "+this.nombre);
            rsColumnas=rsFilas.getMetaData();            
            cargarColumnas(rsColumnas);
            cargarFilas(rsFilas);           
            statement.close();
            rsFilas.close();           
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }finally{
            statement=null;
            rsFilas=null;
        }  
    } 
    
    private void cargarFilas(ResultSet rsFilas){
        try {
            String valores[];
            while(rsFilas.next()){
                valores=new String[totalColumnas()];
                for (int i = 0; i < valores.length; i++) {
                    valores[i]=rsFilas.getString(i+1);                    
                }
                this.listValores.add(valores);                
            }
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }        
    }
    
    private void cargarColumnas(ResultSetMetaData rsColumnas){
        try {
            this.columnas=new Columna[rsColumnas.getColumnCount()];
            for (int i = 0; i < columnas.length; i++) {
                columnas[i]=new Columna(rsColumnas.getColumnName(i+1),rsColumnas.getColumnTypeName(i+1));                
            }
        } catch (Exception ex) {
            this.columnas=new Columna[0];
        }
    }

    @Override
    public String getNombre() {
       return this.nombre;
    }

    @Override
    public int totalColumnas() {
        if (this.columnas != null) {
            return this.columnas.length;
        } else {
            return 0;
        }
    }

    @Override
    public int totalFilas() {
        return this.listValores.size();
    } 

    @Override
    public Columna[] getColumnas() {
       return this.columnas;
    }

    @Override
    public void setColumnas(Columna[] columnas) {
        this.columnas=columnas;
    }

    @Override
    public List<String[]> getListValores() {
        return this.listValores;
    }

    @Override
    public void setListValores(List<String[]> list) {
       this.listValores=list;
    }  

    @Override
    public Columna getColumna(int numColumna) {
        if(this.columnas.length>=numColumna){
            return this.columnas[numColumna];
        }else{
            return null;
        }
    }

    @Override
    public boolean setColumna(Columna columna, int numColumna) {
        boolean resultado = true;
        if (this.columnas.length >= numColumna) {
            for (Columna c : this.columnas) {
                if (c.getNombre().equals(columna.getNombre())) {
                    resultado = false;
                    break;
                }
            }
            if (resultado) {
                this.columnas[numColumna] = columna;
            }
        } else {
            resultado = false;
        }
        return resultado;
    }

    @Override
    public String getValor(int numColumna, int numFila) {
        if(this.columnas.length>=numColumna && this.listValores.size()>=numFila+1){
            return this.listValores.get(numFila)[numColumna];
        }else{
            return null;
        }       
    }

    @Override
    public void setValor(String nuevoValor,int numColumna, int numFila) {
        if(this.columnas.length>=numColumna && this.listValores.size()>=numFila+1 && nuevoValor!=null){
             this.listValores.get(numFila)[numColumna]=nuevoValor;
        }       
    }

    @Override
    public String[] getValoresFila(int numFila) {
        if (this.listValores.size() >= numFila + 1) {
            return this.listValores.get(numFila);
        } else {
            return null;
        }
    }

    @Override
    public void setValoresFila(String[] valores, int numFila) {
        if(valores!=null && this.listValores.size()>=numFila+1){
            this.listValores.set(numFila, valores);
        }
    }

    @Override
    public String[] getValoresColumna(int numColumna) {
        String resultado[] = new String[listValores.size()];
        try {
            for (int i = 0; i < listValores.size(); i++) {
                resultado[i] = listValores.get(i)[numColumna];
            }
        } catch (ArrayIndexOutOfBoundsException ignore) {
            resultado=null;
        }
        return resultado;        
    }
    
     @Override
    public String[] getValoresColumna(String nombreColumna) {
        String resultado[] = new String[listValores.size()];  
        int numColumna=getNumColumna(nombreColumna);
        try {
            for (int i = 0; i < listValores.size(); i++) {
                resultado[i] = listValores.get(i)[numColumna];
            }
        } catch (ArrayIndexOutOfBoundsException ignore) {
            resultado=null;
        }
        return resultado; 
    }    

    @Override
    public void setValoresColumna(String[] valores, int numColumna) {
        try {
            for (int i = 0; i < valores.length; i++) {                
                listValores.set(i,cambiarValorArray(listValores.get(i),valores[i],numColumna));
            }
        } catch (ArrayIndexOutOfBoundsException ignore) {            
        }
    }    
    
    private int getNumColumna(String nombreColumna){
        int resultado = -1;
        int contador = 0;
        for (Columna c : getColumnas()) {
            if (c.getNombre().toUpperCase().equals(nombreColumna.toUpperCase())) {
                resultado = contador;
                break;
            }
            contador++;
        }
        return resultado;
    }
    
    private String[] cambiarValorArray(String array[],String nuevoValor,int pos){
        if(array.length>=pos){
            array[pos]=nuevoValor;
        }
        return array;
    }
    
}
