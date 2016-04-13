/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Henk-PC
 */
public class Connection {
    
    public java.sql.Connection conn;
    
    public Connection(String db_connect_string, String db_userid, String db_password) {
        this.conn = this.connect(db_connect_string, db_userid, db_password);
    }
    
   public java.sql.Connection connect(String db_connect_string, String db_userid, String db_password) {
    try {
       //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       java.sql.Connection conn = DriverManager.getConnection(db_connect_string, db_userid, db_password);
       System.out.println("connected");
       Statement statement = conn.createStatement();
       String queryString = "select * from sysobjects where type='u'";
       ResultSet rs = statement.executeQuery(queryString);
       while (rs.next()) {
          System.out.println(rs.getString(1));
       }
       return conn;
    } catch (Exception e) {
       e.printStackTrace();
    }
    return null;
   }

}
