/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Henk-PC
 */
public class Main {
    public static void main(String[] args) {
        final String MSQL_USER = args[0];
        final String MSQL_PASS = args[1];
        new App(MSQL_USER, MSQL_PASS);
    }
}
