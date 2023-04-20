
package config;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexion {
    
    connection con;
    
    public conexion()
    {
        try{
            class.forName("com.mysql.jbdc.Driver");
            con=DriverManager.getConection("jdbc:mysql://localhost:33060/Tecnologo2023","root","");
            
            
        }catch(Exception e)
        {
        System.err.println("Error"+e);
        }
    }
    public Connection getConnection()
    {
        return con;
    }
}
