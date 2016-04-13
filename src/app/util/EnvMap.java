/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.util;
import java.util.Map;
/**
 *
 * @author Henk-PC
 */
public class EnvMap {
    Map<String, String> env;
    
    public EnvMap() {
        env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                              envName,
                              env.get(envName));
        }
    }
}
