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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = new Connection("jdbc:sqlserver://outdoor-paradise.database.windows.net", "", "");
        System.out.println("Hallo");
    }
    
}
