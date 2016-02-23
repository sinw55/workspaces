package com.ge.pfh.evergreen;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ge.pfh.evergreen.models.Booking;
import com.ge.pfh.evergreen.repositories.BookingRepository;

@SpringBootApplication
public class TestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApiApplication.class, args);
	}
}

@Component
class BookingCommandLineRunner implements CommandLineRunner {

    /* (non-Javadoc)
     * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
     */
    @Override
    public void run( String... arg0 ) throws Exception {
        for(Booking b : this.bookingRepository.findAll()) {
            System.out.println( b.toString() );
        }
    }
    
    @Autowired 
    BookingRepository bookingRepository;
}

@RestController
class BookingRestController {
    
    @RequestMapping("/bookings")
    Collection<Booking> bookings() {
        return this.bookingRepository.findAll();
    }
    
    @Autowired
    BookingRepository bookingRepository;
}
