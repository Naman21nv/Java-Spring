package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * ===========================================================================
 * App.java — Spring Application Entry Point
 * ===========================================================================
 *
 * WHAT HAPPENS HERE:
 *  1. ClassPathXmlApplicationContext reads spring.xml from the classpath.
 *  2. Spring IoC container starts up and creates all beans defined in spring.xml.
 *  3. Dependencies are injected automatically (autowire / setter / constructor).
 *  4. We retrieve the "alien" bean using context.getBean("alien").
 *  5. We call methods on the retrieved bean.
 *
 * IoC (Inversion of Control):
 *  - Normally YOU create objects: Alien a = new Alien();
 *  - With Spring IoC, the CONTAINER creates and manages objects for you.
 *  - You just ask the container: "give me the alien bean" → context.getBean()
 *
 * ApplicationContext vs BeanFactory:
 *  - ApplicationContext is the full-featured Spring container.
 *  - It creates ALL singleton beans at startup (eager initialization).
 *  - Beans marked lazy-init="true" are created only when first requested.
 *
 * SINGLETON BEHAVIOR:
 *  - Both getBean("alien") calls below return the SAME object (same reference).
 *  - Spring creates only ONE instance of singleton beans.
 *  - obj1 == obj2 → TRUE for singleton scope.
 * ===========================================================================
 */
public class App {
    public static void main(String[] args) {

        // Step 1: Start Spring container — reads spring.xml, creates & wires all beans
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Step 2: Retrieve the "alien" bean from the container
        // Spring has already injected age=10 and com=Laptop (via autowire byType)
        Alien obj =context.getBean("alien", Alien.class);

        // Step 3: Access the injected values
        System.out.println("obj.age: " + obj.age);       // 10 (set via <property name="age" value="10"/>)
        System.out.println("obj.getCom(): " + obj.getCom()); // Laptop instance (injected via autowire)

        // Step 4: Call business method — internally calls com.compile() on the Laptop bean
        obj.code();

        // Laptop is now an INNER BEAN inside Alien — it is PRIVATE to Alien.
        // inner beans are not registered in the main application context, so you CANNOT get them directly.
        try {
            System.out.println("Trying to get Laptop bean directly from context...");
            Laptop lap = context.getBean(Laptop.class);
            lap.compile();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            System.out.println("Reason: Laptop is an INNER BEAN inside Alien. It is private and not visible to the context.");
        }

        // HOWEVER, you CAN access the laptop object through the Alien bean because it was injected there:
        Computer com = obj.getCom();
        if(com != null) {
            System.out.println("Accessing Laptop via Alien: success!");
            com.compile();
        }

        Desktop desktop = context.getBean(Desktop.class);
        desktop.compile();

        // laptop i am calling using bean name and desktop i am calling using class name to show that both are working fine and we can call the bean using either way
    }
}
