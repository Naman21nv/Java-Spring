package org.example;

/**
 * Laptop is a Spring-managed bean that acts as a dependency for the Alien bean.
 * It is injected into Alien via Constructor Injection using &lt;constructor-arg ref="lap11"/&gt; in spring.xml.
 */
public class Laptop implements Computer {

    /**
     * Simulates compiling code on the laptop.
     * Called by Alien.code() to demonstrate the injected dependency working.
     */
    @Override
    public void compile() {
        System.out.println("Compiling code on the laptop...");
    }
}
