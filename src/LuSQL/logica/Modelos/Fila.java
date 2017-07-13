package LuSQL.logica.Modelos;

/**
 * Clase que contiene informacion de una fila de una tabla de una base de datos
 * Información que contiene:
 * >Número de fila (0,1,2,3,4...)
 * >Valor de la fila (pc,2004,100€...etc)
 */
public class Fila {
    
    private Tabla tabla;
    private int numFila;
    private String valor;
    
    public Fila(Tabla t) {
        this.tabla=t;        
    }

    public Fila(Tabla t,int numFila, String valor) {
        this.tabla=t;
        this.numFila = numFila;
        this.valor = valor;
    }

    public int getNumFila() {
        return numFila;
    }

    public void setNumFila(int numFila) {
        this.numFila = numFila;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    
}
