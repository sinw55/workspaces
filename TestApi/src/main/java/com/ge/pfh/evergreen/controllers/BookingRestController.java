/*
 * BookingRestController.java
 * 
 * Copyright (c) 2016 by General Electric Company. All rights reserved.
 * 
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.ge.pfh.evergreen.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ge.pfh.evergreen.entities.Booking;
import com.ge.pfh.evergreen.repositories.IBookingRepository;

/**
 * @author shinwoochung
 *
 */
@RestController
public class BookingRestController {
    @RequestMapping("/bookings")
    Collection<Booking> bookings() {
        return this.bookingRepository.findAll();
    }
    
    @Autowired
    IBookingRepository bookingRepository;
}
