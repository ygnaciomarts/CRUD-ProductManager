package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ygnacio
 */
public class Conexion {
    public static Connection getConexion() {
        
        String url = "jdbc:sqlserver://localhost:1433;"
                + "database=tiendaVinilos;"
                + "user=sa;"
                + "password=123456;"
                + "encrypt=false;";
        
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
            
        } catch(SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }   
}
