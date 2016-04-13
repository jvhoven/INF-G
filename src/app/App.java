/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import app.db.Connection;
<<<<<<< HEAD
import app.util.EnvMap;
import app.views.MainView;
=======
>>>>>>> refs/remotes/origin/master

/**
 *
 * @author Henk-PC
 */
public class App {
<<<<<<< HEAD
    
    EnvMap environmentVars;
    
    
    public App() {
        // Connection conn = new Connection("jdbc:sqlserver://outdoor-paradise.database.windows.net", "", "");
        environmentVars = new EnvMap();
        MainView mainView = new MainView();
        mainView.show();
        
=======
     
    public App(String user, String pass) {
        Connection conn = new Connection("jdbc:sqlserver://outdoor-paradise.database.windows.net", user, pass);
>>>>>>> refs/remotes/origin/master
    }    
}
