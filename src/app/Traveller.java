/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Date;

/**
 *
 * @author jeffrey
 */
public class Traveller {
    
    private int id;
    private String name;
    private Date birth_date;
    private Gender gender;
    
    public Traveller(int id, String name, Date birth_date, Gender gender) {
        this.id = id;
        this.name = name;
        this.birth_date = birth_date;
        this.gender = gender;
    }
    
    public Traveller(int id, String name, Date birth_date, String gender) {
        this.id = id;
        this.name = name;
        this.birth_date = birth_date;
        setGender(gender);
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Date getBirthDate() {
        return birth_date;
    }
    
    public void setBirthDate(Date birth_date) {
        this.birth_date = birth_date;
    } 
    
    public String getGender() {
        if(gender == Gender.MALE) {
            return "Man";
        } else {
            return "Vrouw";
        }
    }
    
    public void setGender(String gender) {
        if(gender.equals("male")) {
            this.gender = Gender.MALE;
        } else {
            this.gender = Gender.FEMALE;
        }
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
