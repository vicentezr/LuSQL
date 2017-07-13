package LuSQL.logica.Modelos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que nos permite realizar operaciones sobre una tabla de una base de datos del servidorSQL 
 */
public class Tabla {
    
    private BaseDeDatos bd;
    private String nombre; 
    private List<Columna> listColumnas;
    private List<Fila> listFilas;

    public Tabla(BaseDeDatos bd) {
        this.bd=bd;
        this.listColumnas=new ArrayList();
        this.listFilas=new ArrayList();
    }
    
    public Tabla(BaseDeDatos bd,String nombre) {
        this.bd=bd;
        this.nombre=nombre;
        this.listColumnas=new ArrayList();
        this.listFilas=new ArrayList();
    }
    
    /**
     * Añade una nueva columna a la tabla     
     */
    public void añadirColumna(Columna c){
        this.listColumnas.add(c);        
    }
    /**
     * Añade una nueva fila a la tabla     
     */
    public void añadirFila(Fila f){
        this.listFilas.add(f);
    }
    /**
     * Devuelve una lista de objectos Columna.class    
     */
    public List<Columna> obtenerColumnas(){
        return null;
    }
    /**
     * Devuelve una lista de objectos Fila.class    
     */    
    public List<Fila> obtenerFilas(){
        return null;
    }

    public String getNombre() {
        return nombre;
    }    
    /**
     * Devuelve el numero de columnas que contiene la tabla actualmente     
     */
    public int getTotalColumnas() {
        return listColumnas.size();
    }    

    /**
     * Devuelve el numero de filas que contiene la tabla actualmente     
     */
    public int getTotalFilas() {
        return listFilas.size();
    } 
    
    
    
    
    
}
