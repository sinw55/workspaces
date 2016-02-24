package com.ge.pfh.evergreen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.ge.pfh.evergreen.entities.Booking;
import com.ge.pfh.evergreen.repositories.IBookingRepository;

/*
 * @SpringBootApplication is a convenience annotation that adds all of the following:
 * - @Configuration tags the class as a source of bean definitions for the application context.
 * - @EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
 *    Normally you would add @EnableWebMvc for a Spring MVC app, but Spring Boot adds it automatically when it sees spring-webmvc on the classpath. 
 *    This flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.
 * - @ComponentScan tells Spring to look for other components, configurations, and services in the the hello package, allowing it to find the HelloController
 * 
 * The main() method uses Spring Boot’s SpringApplication.run() method to launch an application. 
 * Did you notice that there wasn’t a single line of XML? No web.xml file either. 
 * This web application is 100% pure Java and you didn’t have to deal with configuring any plumbing or infrastructure.
 * The run() method returns an ApplicationContext and this application then retrieves all the beans that were created either by your app 
 * or were automatically added thanks to Spring Boot. It sorts them and prints them out.
 */
@SpringBootApplication
public class TestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run( TestApiApplication.class, args );
        
//        ApplicationContext ctx = SpringApplication.run( TestApiApplication.class, args );
//        
//        System.out.println( "Let's inspect the beans provided by Spring Boot." );
//        
//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//        for (String beanName : beanNames) {
//            System.out.println(beanName);
//        }
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
    IBookingRepository bookingRepository;
}
