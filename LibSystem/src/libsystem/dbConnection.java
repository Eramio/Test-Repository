package libsystem;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;

public class dbConnection 
{
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "libsystem";
    private static int portnumber = 3306;
    private static String password = "computer0";
    
    
    
    public static Connection getConnection() throws SQLException
    {
        Connection con = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPort(portnumber);
        
        con = datasource.getConnection();
        
        return con;
    }
}

