package LuSQL.logica.Interfaces;

import LuSQL.logica.Columna;
import java.util.List;

/**
 * Interface para el control de las tablas de una bases de datos del servidorSQL 
 */

/**
 * Documentación de uso:
 * El objecto Tabla que vayas a usar implementara estos métodos. 
 * Nota: Objectos Columna, contienen el nombre y tipo de columna 
 */
public interface Tabla {
    
    //devuelve el nombre de la tabla
    public String getNombre();    
    
    //devuelve un array de objectos Columna
    public Columna[] getColumnas();     
    //cambiar las columnas actuales por unas pasadas como parametros
    public void setColumnas(Columna columnas[]);     
    //obtener un objecto Columna a traves de una posicion (empezando por 0)
    public Columna getColumna(int numColumna);    
    //cambiar el objecto columna por una nueva pasada como parametro, ademas de indicar la posicion
    public boolean setColumna(Columna columna,int numColumna); 
    
    //Devuelve una lista de elementos(filas) con sus respectivos valores (por cada columna) en un array
    //Cada columna en el array es indicada por su posicion
    //List.get(0)[0] -> devolvera el valor de la primera fila y la primera columna
    public List<String[]> getListValores(); 
    //obtenemos el valor de la tabla en la posicion "x" de columna y "y" de fila que le pasamos
    public String getValor(int numColumna,int numFila);    
    //modificamos el valor de la tabla en la posicion "x" de columna y "y" de fila que le pasamos
    public void setValor(String nuevoValor,int numColumna, int numFila);    
    //obtenemos un array de valores de una fila que le indicamos como parametro (posicion)
    public String[] getValoresFila(int numFila);    
    //modificamos el array de valores de una fila que le indicamos como parametro (posicion)
    public void setValoresFila(String valores[],int numFila);
    //obtenemos un array de valores de una columna que le indicamos como parametro (posicion)
    public String[] getValoresColumna(int numColumna);  
    //obtenemos un array de valores de una columna que le indicamos como parametro (nombre)
    public String[] getValoresColumna(String nombreColumna);  
    //modificamos un array de valores de una columna que le indicamos como parametro (posicion)
    public void setValoresColumna(String valores[],int numColumna);

}
