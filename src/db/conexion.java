
package db;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Marlon_Mendoza
 */
public class conexion {
    
    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/farmacia";
    
    private final String USER = "root";
    private final String PASS = "Jilaso123.";
    
    
    public void conex() throws SQLException
    {
        
        try {

            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
            System.out.println("Conexion exitosa");
            

            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Conexion erronea");
        }
                
    }
    
}
