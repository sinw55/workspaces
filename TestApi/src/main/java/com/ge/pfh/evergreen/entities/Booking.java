/*
 * Booking.java
 * 
 * Copyright (c) 2016 by General Electric Company. All rights reserved.
 * 
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.ge.pfh.evergreen.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;

/**
 * @author shinwoochung
 *
 */
@Entity
public class Booking {
    @Id 
    @GeneratedValue
    private Long id;
    private String bookingName;
    
    public Booking(String bookingName) {
        super();
        this.bookingName = bookingName;
    }
    
    public Booking() {
        
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId( Long id ) {
        this.id = id;
    }

    /**
     * @return the bookingName
     */
    public String getBookingName() {
        return bookingName;
    }
    
    /**
     * @param bookingName the bookingName to set
     */
    public void setBookingName( String bookingName ) {
        this.bookingName = bookingName;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Booking [id=" + id + ", bookingName=" + bookingName + ", getId()=" + getId() + ", getBookingName()=" + getBookingName() + "]";
    }
}
