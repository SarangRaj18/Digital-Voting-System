
/** connection from database
 * 08/03/2019
 * @author MY PC 
 */
import java.sql.*;
public class DB_Connect
{
    public Connection conn;
     public DB_Connect() throws Exception
     {
         Class.forName("oracle.jdbc.OracleDriver");
         conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
                                                     "System","sarangoracle");
     }
     public void queryExecuter(String sql)throws Exception
     {
          Statement stmt =  conn.createStatement();
            stmt.execute(sql);        
            stmt.close(); 
            conn.close();
     }
     public ResultSet queryReturner(String sql)throws Exception
     {
          Statement stmt =  conn.createStatement();
          ResultSet rs = stmt.executeQuery(sql);
          return rs;
     }
}
