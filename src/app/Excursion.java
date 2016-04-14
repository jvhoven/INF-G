/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.math.BigDecimal;

/**
 *
 * @author jeffrey
 */
public class Excursion {
    private int id;
    private String name;
    private String guide;
    
    public Excursion(int id, String name, String guide) {
        this.id = id;
        this.name = name;
        this.guide = guide;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setGuide(String guide) {
        this.guide = guide;
    }
    
    public String getGuide() {
        return guide;
    }
    
    @Override
    public String toString() {
        return name + " door " + guide;
    }
}
