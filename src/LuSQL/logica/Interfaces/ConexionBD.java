package LuSQL.logica.Interfaces;

import LuSQL.logica.Modelos.BaseDeDatos;
import LuSQL.logica.Modelos.Tabla;
import LuSQL.logica.ServidorSQL;
import java.util.List;

/**
 * Interface para las conexiones realizadas con exito al servidorSQL 
 */
public interface ConexionBD {    
    
    boolean nuevaBaseDeDatos(String nombreBD);   
    boolean eliminarBaseDeDatos(BaseDeDatos bd);
    List<BaseDeDatos> obtenerBasesDeDatos();
    
}
