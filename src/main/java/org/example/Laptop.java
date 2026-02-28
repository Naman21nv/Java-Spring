package org.example;

/*
 * ===========================================================================
 * Laptop.java — Concrete Implementation of Computer Interface
 * ===========================================================================
 *
 * WHAT IS THIS?
 *  - Laptop is a concrete class that IMPLEMENTS the Computer interface.
 *  - It provides the actual implementation of the compile() method.
 *
 * RELATIONSHIP:
 *  Computer (interface)  ←  Laptop (implements)
 *
 * WHY THIS MATTERS IN SPRING:
 *  - Spring cannot instantiate Computer (interface) → new Computer() is invalid.
 *  - Spring CAN instantiate Laptop → <bean id="com" class="org.example.Laptop"/>
 *  - When Alien needs a Computer, Spring injects this Laptop instance.
 *  - Alien's field `Computer com` holds the Laptop object — valid via polymorphism.
 *
 * AUTOWIRE byType:
 *  - Spring scans Alien's dependencies and finds `Computer com`.
 *  - It looks for a bean of type Computer (or any class that implements it).
 *  - Laptop implements Computer → MATCH FOUND → Laptop bean injected into Alien.
 *
 * WHAT IF YOU ADD ANOTHER CLASS?
 *  - e.g., class Desktop implements Computer { ... }
 *  - Add <bean id="desktop" class="org.example.Desktop"/> in spring.xml
 *  - Change <bean id="com" class="org.example.Desktop"/>
 *  - Alien.java stays UNCHANGED — the interface makes this possible.
 * ===========================================================================
 */
public class Laptop implements Computer {

    /*
     * Implementation of the compile() method from Computer interface.
     * Spring calls com.compile() via Alien.code(), and at runtime
     * this method is executed (polymorphism).
     */
    @Override
    public void compile() {
        System.out.println("Compiling code on the laptop...");
    }
}
