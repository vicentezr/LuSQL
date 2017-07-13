package LuSQL.logica.Modelos;

/**
 * Clase que contiene informacion de una columna de una tabla de una base de datos
 * Información que contiene:
 * >Nombre de la columna (DNI,Nombre,Teléfono..)
 * >Tipo de valor (int,text,varchar..etc)
 */
public class Columna {    
    
    private Tabla tabla;
    private String nombre;
    private String tipoValor;    
    
     public Columna(Tabla t) {
        this.tabla=t; 
    } 

    public Columna(Tabla t,String nombre, String tipoValor) {
        this.tabla=t;
        this.nombre = nombre;
        this.tipoValor = tipoValor;
    } 
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(String tipoValor) {
        this.tipoValor = tipoValor;
    }
        
    
}
