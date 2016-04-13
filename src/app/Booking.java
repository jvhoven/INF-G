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
public class Booking {
    
    private Trip trip;
    private Booker booker;
    private Date date;
    private boolean cancellation_insurance;
    
    public Booking(Trip trip, Booker booker, Date date, boolean cancellation_insurance) {
        this.trip = trip;
    }
    
}
