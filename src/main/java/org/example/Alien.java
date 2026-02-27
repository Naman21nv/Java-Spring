package org.example;

public class Alien {

    int age;
    Computer com;

    public Alien() {
        System.out.println("No-arg constructor called...");
    }

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

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        if (com != null) {
            com.compile();
            System.out.println("Alien is coding in Java!");
        }
    }
}
