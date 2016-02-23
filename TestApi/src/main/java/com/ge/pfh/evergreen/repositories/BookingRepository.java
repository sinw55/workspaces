/*
 * BookingRepository.java
 * 
 * Copyright (c) 2016 by General Electric Company. All rights reserved.
 * 
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.ge.pfh.evergreen.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ge.pfh.evergreen.models.Booking;

/**
 * @author shinwoochung
 *
 */
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Collection<Booking> findByBookingName(String bookingName);
}
