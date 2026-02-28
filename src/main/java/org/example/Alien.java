package org.example;

/*
 * ===========================================================================
 * Alien.java — Spring Bean with Constructor + Setter Injection
 * ===========================================================================
 *
 * This class is a Spring-managed bean that demonstrates:
 *  1. Constructor Injection  — Spring passes values via the constructor
 *  2. Setter Injection       — Spring calls setXxx() methods to inject values
 *  3. Autowiring             — Spring automatically resolves and injects
 *                              a matching bean without explicit <ref>
 *
 * DEPENDENCY:
 *  - Alien depends on the `Computer` interface (not a concrete class).
 *  - `Computer` is an interface. We CANNOT create an object of an interface
 *    directly: new Computer()  ← NOT ALLOWED
 *  - But we CAN have a reference variable of type Computer:
 *    Computer com;             ← allowed (holds a reference to any class
 *                                         that implements Computer)
 *  - At runtime, Spring injects a Laptop object (which implements Computer)
 *    into this `com` field → this is called "programming to an interface"
 *
 * HOW AUTOWIRE WORKS HERE (autowire="byType"):
 *  - Spring looks at the properties/fields of Alien that need injection.
 *  - It finds `Computer com` (via setter setCom or constructor param).
 *  - It scans all beans in spring.xml and looks for a bean whose class
 *    matches the type `Computer` (or implements it).
 *  - It finds the bean: <bean id="com" class="org.example.Laptop"/>
 *    because Laptop implements Computer → type matches!
 *  - Spring automatically injects that Laptop bean into this field.
 *  - You do NOT need to write <property name="com" ref="..."/> manually.
 *
 * WHY AUTOWIRE IS IMPORTANT:
 *  - Without autowire: you must manually write <property ref="..."/> or
 *    <constructor-arg ref="..."/> for every dependency in spring.xml.
 *  - With autowire: Spring figures out the dependency automatically,
 *    reducing XML config and potential human error.
 *
 * WHY USE interface Computer instead of class Laptop directly?
 *  - Loose coupling: Alien doesn't care WHICH computer it uses.
 *  - Tomorrow if you add Desktop implements Computer, you just change
 *    spring.xml to point to Desktop. Alien.java doesn't change at all.
 *  - This is the core OOP principle: "Depend on abstractions, not on
 *    concrete implementations."
 *
 * HOW SETTER INJECTION WORKS:
 *  - When you use <property name="age" value="10"/> in spring.xml,
 *    Spring calls the NO-ARG constructor first, then calls setAge(10).
 *  - For <property name="com" ref="lap11"/>, Spring calls setCom(laptop).
 *  - Setter injection requires a no-arg constructor to be present.
 *
 * HOW CONSTRUCTOR INJECTION WORKS:
 *  - When you use <constructor-arg value="50"/> and
 *    <constructor-arg ref="lap11"/>, Spring calls:
 *    new Alien(50, laptopBean)  — directly via the 2-arg constructor.
 *  - No no-arg constructor is needed for this approach.
 *
 * CURRENTLY ACTIVE:
 *  - Setter injection for `age` via <property name="age" value="10"/>
 *  - Autowire byType for `com` (Spring finds Laptop bean automatically)
 *  - No-arg constructor is called by Spring (required for setter injection)
 *  - 2-arg constructor is present but NOT used (constructor-arg commented out)
 * ===========================================================================
 */
public class Alien {

    int age;

    /*
     * `com` is of type Computer (interface).
     * Spring will inject a Laptop object here via autowire or <property ref>.
     * Even though Computer is an interface, we can use it as a reference type.
     * The actual object assigned will always be a class that implements Computer.
     */
    Computer com;

    /*
     * No-arg constructor — required when using Setter Injection.
     * Spring calls this first, then calls the setXxx() methods to inject values.
     */
    public Alien() {
        System.out.println("No-arg constructor called...");
    }

    /*
     * 2-arg Constructor — used for Constructor Injection.
     * Spring calls: new Alien(50, laptopBean)
     * - age is injected via <constructor-arg value="50"/>
     * - com is injected via <constructor-arg ref="lap11"/>
     *
     * The parameter `Computer com` accepts ANY object that implements Computer.
     * When autowire or ref is used, Spring passes the Laptop bean here.
     * Even though `com` is declared as Computer (interface), the actual
     * runtime object is a Laptop instance → valid because Laptop implements Computer.
     *
     * Currently commented out in spring.xml — setter injection is active instead.
     */
    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
        System.out.println("Constructor called... Injection done...");
    }

    // Getter and Setter for `age` — required for setter injection via <property name="age"/>
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
     * Getter and Setter for `com` — required for setter injection via <property name="com"/>
     * OR for autowire="byType" / autowire="byName" to work via setter.
     * Spring calls setCom(laptopBean) automatically when autowire is active.
     */
    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    /*
     * Business method — uses the injected Computer to compile code.
     * `com.compile()` works because:
     *   - `com` is of type Computer (interface with compile() method)
     *   - The actual object is Laptop, which has the real implementation
     *   - Java calls Laptop's compile() at runtime via polymorphism
     */
    public void code() {
        if (com!= null) {
            com.compile();
            System.out.println("Alien is coding in Java!");
        }
    }
}
