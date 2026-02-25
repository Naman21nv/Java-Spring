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
     *
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
        Alien obj1 = (Alien) context.getBean("alien1");

        // Modify first bean's age property
        obj.age = 21;

        // Output: 21 (modified value)
        System.out.println("obj.age: " + obj.age);

        // Output: 0 (unchanged, different object instance)
        System.out.println("obj1.age: " + obj1.age);

        /*
         * IMPORTANT: Different bean IDs create separate instances
         * - obj and obj1 are independent objects
         * - Changing obj.age does NOT affect obj1.age
         *
         * If multiple references used the same bean ID, they would share
         * the same instance and modifications would be visible to all references.
         */
    }
}

