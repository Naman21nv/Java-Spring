package org.example;

public class Alien {
    private int age;

   laptop lap;
     /*Laptop lap=new Laptop()*;// in this way also we can create obj of laptop
                             // but instead of new keyword we use ref in spring xml file and spring will create the
                             // obj of laptop and inject it in alien class  by giving ref and id of laptop bean in spring xml file*/
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

    // Method to demonstrate alien coding behavior
    public void code(){
       lap.compile();
      System.out.println("Alien is coding in Java!");
    }


}
