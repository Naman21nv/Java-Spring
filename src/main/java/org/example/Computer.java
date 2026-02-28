package org.example;

/*
 * ===========================================================================
 * Computer.java — Interface for Alien's Dependency
 * ===========================================================================
 *
 * WHAT IS THIS?
 *  - Computer is an interface, NOT a class.
 *  - It defines a CONTRACT: any class that implements Computer MUST
 *    provide a `compile()` method.
 *
 * WHY AN INTERFACE?
 *  - Alien depends on Computer (the interface), not on Laptop (the class).
 *  - This gives us LOOSE COUPLING:
 *      * Alien doesn't care if it's a Laptop, Desktop, or Server.
 *      * As long as the class implements Computer, it works with Alien.
 *  - This is "programming to an interface" — a core OOP design principle.
 *
 * CAN WE CREATE AN OBJECT OF AN INTERFACE?
 *  - NO: new Computer()  ← compile error
 *  - YES as a reference: Computer com = new Laptop();  ← valid
 *    (Laptop implements Computer, so it IS-A Computer)
 *
 * HOW SPRING USES THIS:
 *  - In Alien, the field is: Computer com;
 *  - Spring sees the bean <bean id="com" class="org.example.Laptop"/>
 *  - Laptop implements Computer → Spring injects the Laptop bean into `com`
 *  - autowire="byType" matches by the type Computer (Laptop satisfies it)
 *  - Getter/setter (getCom/setCom) work on the Computer type — perfectly valid.
 * ===========================================================================
 */
public interface Computer {
    void compile();
}
