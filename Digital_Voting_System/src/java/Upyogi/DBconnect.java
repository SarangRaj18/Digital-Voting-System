package Upyogi;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MY PC
 */
public class DBconnect {
    public Connection conn;
     public DBconnect() throws Exception
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
