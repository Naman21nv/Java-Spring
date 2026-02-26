package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring XML Configuration Demo
 *
 * Demonstrates basic Spring bean creation and management using XML configuration.
 * Shows how Spring creates and manages object instances based on bean definitions.
 */
public class App {
    /**
     * Main entry point for the application.
     * <p>
     * Creates a Spring application context from XML configuration and retrieves
     * bean instances to demonstrate Spring's dependency injection.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Load Spring configuration from spring.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Retrieve first bean instance (id="alien")
        Alien obj = (Alien) context.getBean("alien");

        // Retrieve second bean instance (id="alien1")
        // Alien obj1 = (Alien) context.getBean("alien1"); // uncomment when alien1 bean is added in spring.xml

        // Display the injected values
        System.out.println("\n===== Spring Bean Demo =====");
        System.out.println("Alien age: " + obj.age);

        // Call method that uses the injected dependency
        obj.code();
        System.out.println("===== Demo Complete =====\n");
    }
}
