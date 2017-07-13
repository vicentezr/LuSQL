package LuSQL.logica.Modelos;

import LuSQL.logica.Interfaces.ConexionBD;
import java.util.List;

/**
 * Clase que nos permite realizar operaciones en una base de datos concreta del servidorSQL conectado. 
 */

public class BaseDeDatos {
    
    private ConexionBD conexion;

    public BaseDeDatos(ConexionBD conexion) {
        this.conexion=conexion;
    }

    /**
     * Ejecuta una instrucción en la BD (create,update,drop....etc)
     * @param sentencia : instruccion para que se ejecute en la base de datos     
     */
    public boolean ejecutarSentencia(String sentencia){
        return false;
    }
    /**
     * Ejecuta una query (Select...) en la base de datos, y como resultado obtenemos un Objecto Tabla.class
     * @param consulta     
     */
    public Tabla ejecutarConsulta(String consulta){
        return null;
    }
    
    /**
     * Crea internamente una nueva tabla, mediante un nombre que le pasemos como parametro
     * !!!Los nombres de las tablas no pueden estar repetidos     
     */
    public boolean nuevaTabla(String nombreTabla){
        return false;
    }
    /**
     * Elimina una tabla y su contenido, si le pasamos un objecto Tabla.class valido y existente     
     */
    public boolean eliminarTabla(Tabla tabla){
        return false;
    }
    
    /**
     * Obtenemos una lista de objectos Tabla.class que existen actualmente en esta base de datos     
     */
    public List<Tabla> obtenerTablas(){
        return null;
    } 
    
}
