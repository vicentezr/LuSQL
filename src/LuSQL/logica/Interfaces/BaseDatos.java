package LuSQL.logica.Interfaces;
import LuSQL.logica.ServidorSQL;
import java.sql.SQLException;
import java.util.List;

/**
 * Interface para el control de las bases de datos del servidorSQL 
 */

/**
 * Documentacion de uso:
 * El objecto de BaseDatos vayas a usar, tendra implementados estos metodos * 
 * Métodos inoperativos actualmente:
 *      -ejecutarSentencia
 *      -ejecutarConsulta
 *      -crearNuevaTabla
 *      -eliminarTabla * 
 * 
 * Algunos métodos devuelve un objecto Tabla, que nos permite acceder a mas métodos
 * +info sobre los objectos Tabla, en Interfaces->Tabla
 */
public interface BaseDatos { 
  
    //Devuelve los nombres de todas las tablas de la bd en una lista
    List<String> obtenerNombreTablas() throws SQLException;
    //Devuelve todas las tablas en forma de objectos Tabla en una lista
    List<Tabla> obtenerTablas() throws SQLException;
    //Devuelve un objecto Tabla mediante un nombre que le pasemos como parametro
    Tabla obtenerTabla(String tabla) throws SQLException;
    //Crea una nueva tabla en la base de datos, si le enviamos una como parametro
    boolean crearNuevaTabla(Tabla tabla);
    //Elimina una tabla con el nombre que le pasamos como parametro, si existe.
    boolean eliminarTabla(String nombreTabla);
    //Ejecuta una orden que le pasamos como parametro
    void ejecutarSentencia(String sentencia) throws SQLException;
    //Ejecuta una consulta que le pasamos como paramentro y nos devuelve una Tabla
    Tabla ejecutarConsulta(String consulta);
    //Nos devuelve el objecto servidor
    ServidorSQL getServidor();
    
}
