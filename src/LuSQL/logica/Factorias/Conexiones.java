package LuSQL.logica.Factorias;
import LuSQL.logica.ServidorSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Factoria para las conexiones de la aplicación
 */
public class Conexiones {
    
    private static Connection conexionSQL;
    
    /**
     * Este método nos devuelve un objecto Connection, si la conexxion al servidor (pasado como parametro) es correcta
     * Ademas, se asegura que cada vez que lo llamemos, no nos crea otro objecto Connection. Si no que si ya existe
     * nos devuelve el mismo.     
     */
    public static Connection getConexionSQL(ServidorSQL s) throws SQLException{
        if(conexionSQL==null){
           
            switch(s.getTipo()){
                case MYSQL:
                    conexionSQL=DriverManager.getConnection("jdbc:mysql://"+s.getUrl()+":"+s.getPuerto(),s.getUsuario(),s.getContraseña());
                    break;
                    case SQL_SERVER:
                        conexionSQL=DriverManager.getConnection("jdbc:sqlserver://"+s.getUrl()+":"+s.getPuerto(),s.getUsuario(),s.getContraseña());
                    break;
                case SQL_SERVER_Windows:
                        conexionSQL=DriverManager.getConnection("jdbc:sqlserver://"+s.getUrl()+":"+s.getPuerto(),s.getUsuario(),s.getContraseña());
                    break;
                case POSTGRESQL:
                         conexionSQL=DriverManager.getConnection("jdbc:postgresql://"+s.getUrl()+":"+s.getPuerto(),s.getUsuario(),s.getContraseña());
                    break;
            }
        }
        return conexionSQL;
    }
    
}
