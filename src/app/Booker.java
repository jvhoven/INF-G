/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author jeffrey
 */
public class Booker {
    private Traveller traveller;
    private String iban;
    
    public Booker(Traveller traveller, String iban) {
        this.traveller = traveller;
        this.iban = iban;
    }
    
    public Traveller getTraveller() {
        return traveller;
    }
    
    public void setTraveller(Traveller traveller) {
        this.traveller = traveller;
    }
    
    public void setIban(String iban) {
        this.iban = iban;
    }
    
    public String getIban() {
        return iban;
    }
    
    public String toString() {
        return traveller.toString() + " " + iban;
    }
}
