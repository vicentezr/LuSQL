package LuSQL.logica;

import java.sql.Connection;
import java.sql.SQLException;
import LuSQL.logica.Interfaces.BaseDatos;
import java.sql.DriverManager;

/**
 * <h1>Clase donde se establecen los parametros del servidor</h1>
 */

/**
 * Documentacion de uso:
 * Crear un nuevo objecto ServidorSQL cada vez que necesites conectarte a una base de datos.
 * Requiere de los siguientes paramentros:
 *      -host : url donde se encuentra la base de datos
 *      -baseDeDatos: el nombre de la base de datos que quieras conectarte
 *      -usuario: nombre de usuario que permita acceso a la bd
 *      -contraseña: contraseña del usuario
 *      -puerto: puerto que permita la conexion a la bd
 *      -TipoBD: indica que tipo de bd vas usar. Puedes acceder escribiendo el nombre de la clase (Ej: TipoBD.Mysql)
 * 
 * Una vez creado el objecto servidor, y a traves de sus métodos puedes:
 *      -conectarte: te devolvera un objecto BaseDatos (+info en la interfaz BaseDatos)
 *      -terminar conexion: cierra la conexion actual.
 * 
 * Nota: Si usas una bd SQL_Server_Windows, puedes pasar el usuario y contraseña como null, ya que no son necesarios
 * 
 * !!!IMPORTANTE!!!
 * Acuerdate de terminar la conexion, cuando ya acabaste de usar el objecto servidor, o el usuario cierra el programa.
 * Si terminas la conexion, y despues realizas algun metodo sobre el servidor, este va a intentar volver lanzar la conexion,
 * pero es aconsejable que no la termines si vas a necesitar volver a conectarte para mas cosas
 */
public class ServidorSQL {
    
    private String host;
    private String baseDeDatos;
    private String usuario;
    private String contraseña;
    private String puerto;
    private TipoBD tipo;
    
    //Objectos de jdbc
    private Connection conexion;
    

    public ServidorSQL(String url,String bd,String usuario, String contraseña, String puerto, TipoBD tipo) {
        this.host = url;
        this.baseDeDatos=bd;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.puerto = puerto;
        this.tipo = tipo;
    }   
   
    //GETTERS/SETTERS   
    
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getBaseDeDatos() {
        return baseDeDatos;
    }

    public void setBaseDeDatos(String baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
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
    
    //TODO revisar que todas las conexiones funcionen
    public Connection getConexion() throws SQLException{
        if(conexion==null){           
            String url="";
            switch(getTipo()){
                case MYSQL:
                    url="jdbc:mysql://"+getHost()+":"+getPuerto()+"/"+getBaseDeDatos();
                    conexion=DriverManager.getConnection(url,getUsuario(),getContraseña());
                    break;
                    case SQL_SERVER:
                        url="jdbc:sqlserver://"+getHost()+":"+getPuerto()+"/"+getBaseDeDatos();
                        conexion=DriverManager.getConnection(url,getUsuario(),getContraseña());
                    break;
                case SQL_SERVER_Windows:
                    url="jdbc:sqlserver://"+getHost()+":"+getPuerto()+";databaseName="+getBaseDeDatos();
                        conexion=DriverManager.getConnection(url+";integratedSecurity=true");
                    break;
                case POSTGRESQL:
                    url="jdbc:postgresql://"+getHost()+":"+getPuerto()+"/"+getBaseDeDatos();
                         conexion=DriverManager.getConnection(url,getUsuario(),getContraseña());
                    break;
                default:
                    url="";
                    break;
            }
        }
        return conexion;
    }   
   
    public BaseDatos conectarse() throws SQLException{        
       conexion=getConexion();
       if(conexion!=null){
           return new ConexionBD(this);
       }else{
           return null;
       } 
    }
    
    /**
     * Intenta cerrar la conexión si esta activa
     * @throws SQLException 
     */
    public void terminarConexion() throws SQLException{
        if(this.conexion!=null){
            getConexion().close();
        }        
    }    
    
}
