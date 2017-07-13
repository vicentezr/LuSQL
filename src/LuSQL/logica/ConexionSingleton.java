package LuSQL.logica;

import java.util.List;
import LuSQL.logica.Interfaces.ConexionBD;
import LuSQL.logica.Modelos.BaseDeDatos;

/**
 * Clase que nos permite trabajar con las base de datos de un servidorSQL
 */
public class ConexionSingleton implements ConexionBD{
    
    private ServidorSQL servidor;


    public ConexionSingleton(ServidorSQL servidor) {
        this.servidor=servidor;
    }

    /**
     * Crea una nueva base de datos a partir de un nombre que le pasemos como parametro
     * @param nombreBD     
     */
    @Override
    public boolean nuevaBaseDeDatos(String nombreBD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Elimina una base de datos(completamente) en el servidor, require como parametro un objecto BaseDeDatos.class
     * @param bd     
     */
    @Override
    public boolean eliminarBaseDeDatos(BaseDeDatos bd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Nos devuelve una lista de objectos(BasesDeDatos), disponibles en el servidor actualmente
     * @return 
     */
    @Override
    public List<BaseDeDatos> obtenerBasesDeDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
