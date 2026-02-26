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
    private Laptop lap;

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
     * No setter methods are needed in this case.
     *
     * @param age the age value injected by Spring via &lt;constructor-arg value="50"/&gt;
     * @param lap the Laptop bean injected by Spring via &lt;constructor-arg ref="lap11"/&gt;
     */
    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
        System.out.println("Constructor called... Injection done...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    /**
     * Demonstrates using the injected Laptop dependency.
     * This works because Spring injected the Laptop object via constructor.
     */
    public void code() {
        if (lap != null) {
            lap.compile();
            System.out.println("Alien is coding in Java!");
        }
    }

}
