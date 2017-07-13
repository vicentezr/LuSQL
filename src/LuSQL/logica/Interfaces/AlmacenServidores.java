package LuSQL.logica.Interfaces;

import LuSQL.logica.ServidorSQL;
import java.util.List;

/**
 * Interface para el almacenamiento de datos de los servidoresSQL 
 */
public interface AlmacenServidores {
    
    List<ServidorSQL> obtenerTodos();
    boolean estaAlmacenado(ServidorSQL servidor);
    boolean guardar(ServidorSQL servidor);
    boolean eliminar(ServidorSQL servidor);
    boolean eliminarTodo();
    
}
