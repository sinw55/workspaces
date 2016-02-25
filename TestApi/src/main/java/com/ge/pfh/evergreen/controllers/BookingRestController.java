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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ge.pfh.evergreen.entities.Booking;
import com.ge.pfh.evergreen.repositories.IBookingRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author shinwoochung
 *
 */
@RestController
@Api("Booking")
public class BookingRestController {
    
    @RequestMapping(value = "/bookings", method = {RequestMethod.POST, RequestMethod.GET})
    @ApiOperation(value = "list bookings")
    @ApiResponses(value = {
                           @ApiResponse(code = 200, message = "Successful"),        
                           @ApiResponse(code = 404, message = "Not Successful")
    })
    public Collection<Booking> bookings() {
        return this.bookingRepository.findAll();
    }
    
    @Autowired
    IBookingRepository bookingRepository;
}
