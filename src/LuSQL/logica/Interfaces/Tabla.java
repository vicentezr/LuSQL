package LuSQL.logica.Interfaces;

import LuSQL.logica.Columna;
import java.util.List;

 //Interface para el control de las tablas de una bases de datos del servidorSQL  

/**
 * Los objectos Tabla, contienen información y valores de sus datos.
 * Una tabla está compuesta por: <br/>
 * -Columnas : {@link LuSQL.logica.Columna} <br/>
 * -Filas : List&lt;String[]&gt;}, listas que contienen arrays con sus valores
 */
public interface Tabla {    
    /**
     * @return nombre de la tabla
     */
    public String getNombre(); 
    /**
     * @return número de columnas de la tabla
     */
    public int totalColumnas();
    /**     
     * @return número de filas de la tabla
     */
    public int totalFilas();
    
    /**
     * Obtener todas las columnas de la tabla.
     * @return Array de {@link LuSQL.logica.Columna}
     */
    public Columna[] getColumnas();     
    /**
     * Modificar todas las columnas de la tabla.
     * @param columnas
     */
    public void setColumnas(Columna columnas[]);     
    /**
     * Obtener una {@link LuSQL.logica.Columna} mediante una posición.
     * @param numColumna : posición de la columna que buscamos (empezando por 0)
     * @return {@link LuSQL.logica.Columna}
     */
    public Columna getColumna(int numColumna);    
    /**
     * Modificar una columna de la tabla.
     * @param columna
     * @param numColumna : empezando por 0
     * @return
     *  true: Si la modificación se efectuo correctamente <br/>
     *  false: No se pudo realizar la modificación
     */
    public boolean setColumna(Columna columna,int numColumna);     
    /**
     * Obtener una lista con todos los valores de la tabla.
     * @return List&lt;String[]&gt; : Cada elemento de la lista, contiene un array. Estos array 
     * contienen los valores de cada una de las columnas. Por lo que si tenemos 4 columnas, el array contendra 4 valores. <br/>
     * Ejemplo: <br/>
     * myList.get(0)[0] -> obtenemos el valor de la primera fila, y de la primera columna.
     */
    public List<String[]> getListValores(); 
    /**
     * Modificamos todos los valores de la tabla.
     * @param list List&lt;String[]&gt; : Cada elemento de la lista, contiene un array. Estos array 
     * contienen los valores de cada una de las columnas. Por lo que si tenemos 4 columnas, el array contendra 4 valores. <br/>
     * Ejemplo: <br/>
     * myList.get(0)[0] -> obtenemos el valor de la primera fila, y de la primera columna.
     */
    public void setListValores(List<String[]> list);
    /**
     * Obtener un valor de la tabla en una determinada columna y fila.
     * @param numColumna : empieza por 0
     * @param numFila : empieza por 0
     * @return String valor
     */
    public String getValor(int numColumna,int numFila);    
    /**
     * Modificar un valor de la tabla en una determinada columna y fila
     * @param nuevoValor
     * @param numColumna : empieza por 0
     * @param numFila : empieza por 0
     */
    public void setValor(String nuevoValor,int numColumna, int numFila);    
    /**
     * Obtener todos los valores de una fila (el total de valores, depende del total de columnas)
     * @param numFila : empieza por 0
     * @return Array que contiene un valor por cada columna
     */
    public String[] getValoresFila(int numFila);    
    /**
     * Modificar todos los valores de una fila
     * @param valores :Array con los nuevos valores
     * @param numFila : empieza por 0
     */
    public void setValoresFila(String valores[],int numFila);
    /**
     * Obtener todos los valores de una columna mediante una determinada posición
     * @param numColumna : empieza por 0
     * @return Array de valores de cada una de las filas de la columna
     */
    public String[] getValoresColumna(int numColumna);  
    /**
     * Obtener todos los valores de una columna mediante su nombre
     * @param nombreColumna
     * @return Array de valores de cada una de las filas de la columna
     */
    public String[] getValoresColumna(String nombreColumna);  
    /**
     * Modifica todos los valores de una columna mediante una determinada posición
     * @param valores Array de valores de cada una de las filas de la columna
     * @param numColumna : empieza por 0
     */
    public void setValoresColumna(String valores[],int numColumna);

}
