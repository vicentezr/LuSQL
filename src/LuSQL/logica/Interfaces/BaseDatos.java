package LuSQL.logica.Interfaces;
import LuSQL.logica.Columna;
import LuSQL.logica.ServidorSQL;
import java.sql.SQLException;
import java.util.List;

 //Interface para el control de las bases de datos del servidorSQL 

/**
 * Los objectos BaseDatos, permiten realizar varias opciones en el {@link LuSQL.logica.ServidorSQL}
 * al que estan conectados.<br/>
 * BaseDatos, solo se obtiene a partir de un servidorSQL.
 */
public interface BaseDatos { 
    /** 
     * Obtener una lista con los nombres de las tablas existentes en la base de datos.
     * @return List&lt;String&gt;
     * @throws SQLException 
     */
    List<String> obtenerNombreTablas() throws SQLException;
    /**
     * Obtener una lista con todas las tablas de la base de datos.
     * @return List&lt;{@link LuSQL.logica.Interfaces.Tabla}&gt;
     * @throws SQLException 
     */
    List<Tabla> obtenerTablas() throws SQLException;
    /**
     * Obtener una tabla de la base de datos.
     * @param tabla : String con el nombre de la tabla que buscas
     * @return @see {@link LuSQL.logica.Interfaces.Tabla}
     * @throws SQLException 
     */
    Tabla obtenerTabla(String tabla) throws SQLException;
    /**
     * Crear una nueva tabla en la base de datos.
     * @param nombreTabla
     * @param c : Array de objectos Columna, que se asignaran a la tabla
     * @return
     * true: se creo la tabla correctamente; <br/>
     * false: no se pudo crear la tabla (Comprobar que no exista una tabla con el mismo nombre)
     */
    boolean crearNuevaTabla(String nombreTabla,Columna[] c);
    /**
     * Elimina una tabla existente en la base de datos.
     * @param nombreTabla
     * @return 
     * true: Si la tabla fue eliminada con éxito <br/>
     * false: No se pudo eliminar la tabla (Si no existe una tabla con ese nombre, no puede ser eliminada)
     */
    boolean eliminarTabla(String nombreTabla);
    /**
     * Ejecutamos una sentencia en la base de datos.
     * @param sentencia
     * @throws SQLException 
     */
    void ejecutarSentencia(String sentencia) throws SQLException;
    /**
     * Ejecutamos una consulta a la base de datos (Consulta, se refiere a una instrucción que devuelve valores).
     * @param consulta
     * @return @see {@link LuSQL.logica.Interfaces.Tabla}
     */
    Tabla ejecutarConsulta(String consulta);
    /**
     * Obtenemos el objecto servidor al que esta conectado la base de datos.
     * @return 
     * @see {@link LuSQL.logica.ServidorSQL} <br/>
     * null: Si no se pudo obtener datos de la tabla
     */
    ServidorSQL getServidor();
    
}
