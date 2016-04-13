/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import app.db.Connection;

/**
 *
 * @author Henk-PC
 */
public class App {
     
    public App(String user, String pass) {
        Connection conn = new Connection("jdbc:sqlserver://outdoor-paradise.database.windows.net", user, pass);
    }    
}
