package org.example;

/**
 * Alien is a Spring-managed bean that demonstrates both
 * Constructor Injection and Setter Injection in Spring XML configuration.
 *
 * <p>Constructor Injection: age and lap are injected via Alien(int age, Laptop lap)</p>
 * <p>Setter Injection: age and lap can also be injected via setAge() and setLap()</p>
 */
public class Alien {

    int age;
    // Interface type — can store any implementation (Laptop, Desktop, etc.)
    Computer com;

    /**
     * No-arg constructor — required by Spring when using setter injection.
     * Spring first calls this to create the bean instance,
     * then calls setter methods to inject values.
     */
    public Alien() {
        System.out.println("No-arg constructor called...");
    }

    /**
     * Parameterized constructor — used for Constructor Injection.
     * Spring calls this directly when &lt;constructor-arg&gt; is defined in spring.xml.
     *
     * Note: We accept Computer interface type, but Spring injects Laptop (the concrete implementation)
     * This is polymorphism - Laptop IS-A Computer because it implements the interface.
     *
     * @param age the age value injected by Spring via &lt;constructor-arg value="50"/&gt;
     * @param com the Computer implementation (Laptop) injected by Spring via &lt;constructor-arg ref="lap11"/&gt;
     */
    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
        System.out.println("Constructor called... Injection done...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get the Computer dependency (could be Laptop, Desktop, or any other Computer implementation).
     * The interface type allows flexibility - we can swap implementations without changing this code.
     */
    public Computer getCom() {
        return com;
    }

    /**
     * Set the Computer dependency via setter injection.
     * Spring can inject the dependency using: &lt;property name="com" ref="lap11"/&gt;
     */
    public void setCom(Computer com) {
        this.com = com;
    }

    /**
     * Demonstrates using the injected Computer dependency.
     * Since Laptop implements Computer, we can call compile() on it.
     */
    public void code() {
        if (com != null) {
            com.compile();
            System.out.println("Alien is coding in Java!");
        }
    }
}
