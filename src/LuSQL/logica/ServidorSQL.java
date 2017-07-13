package LuSQL.logica;

import LuSQL.logica.Factorias.Conexiones;
import LuSQL.logica.Interfaces.ConexionBD;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * <h1>Clase donde se establecen los parametros del servidor</h1>
 * Ademas podremos conectar,desconectar,guardar,eliminar
 *> El método conectar: (Accede a una factoria, para comprobar que la conexion se establece correctamente) * 
 *  Si no salta ninguna exception,nos devolvera una clase que implementa los metodos de ConexionBD. Esta nos permite trabajar con metodos relacionados con la bases de datos
 * 
 * > Los métodos guardar y eliminar, sirven para guardar o eliminar los parametros de este servidor en un archivo,
 *   de forma que al cerrar el programa y volverlo abrir podamos recuperar los datos del servidor automaticamente.
 */
public class ServidorSQL {
    
    private String url;
    private String usuario;
    private String contraseña;
    private String puerto;
    private TipoBD tipo;

    public ServidorSQL(String url, String usuario, String contraseña, String puerto, TipoBD tipo) {
        this.url = url;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.puerto = puerto;
        this.tipo = tipo;
    }   
   
    //GETTERS/SETTERS   
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public TipoBD getTipo() {
        return tipo;
    }

    public void setTipo(TipoBD tipo) {
        this.tipo = tipo;
    }       
   
    /**
     * (Accede a una factoria, para comprobar que la conexion se establece correctamente) * 
     * Si no salta ninguna exception,nos devolvera una clase que implementa los metodos de ConexionBD.      
     * @return ConexionBD.class
     * @throws SQLException 
     */
    public ConexionBD conectarse() throws SQLException{
        Connection c=Conexiones.getConexionSQL(this);
        return new ConexionSingleton(this);
    }
    
    /**
     * Intenta cerrar la conexión si esta activa
     * @throws SQLException 
     */
    public void terminarConexion() throws SQLException{
        Conexiones.getConexionSQL(this).close();
    }
    
    /**
     * Guarda los parametros del servidor en un fichero
     * @return 
     * true: guardado correctamente
     * false: se producion algun error
     */
    public boolean guardar(){
        return false;
    }
    
    /**
     * Elimina los parametros del servidor de un fichero existente
     * @return 
     * true: eliminacion completa
     * false: se producion algun error
     */
    public boolean eliminar(){
        return false;
    }
    
    
    
    
    
    
    
}
