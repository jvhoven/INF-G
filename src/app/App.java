/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import app.db.Connection;
import app.util.EnvMap;
import app.views.MainView;

/**
 *
 * @author Henk-PC
 */
public class App {
    
    EnvMap environmentVars;
    
    
    public App() {
        // Connection conn = new Connection("jdbc:sqlserver://outdoor-paradise.database.windows.net", "", "");
        environmentVars = new EnvMap();
        MainView mainView = new MainView();
        mainView.show();
        
    }    
}
