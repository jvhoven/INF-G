/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import app.db.Connection;
import app.views.MainView;
/**
 *
 * @author Henk-PC
 */
public class App {
     
    public static java.sql.Connection conn;
    
    public App(String user, String pass) {
        this.conn = new Connection("jdbc:sqlserver://outdoor-paradise.database.windows.net;database=outdoor-paradise", user, pass).conn;
        MainView mainView = new MainView();
        mainView.show();

    }    
}
