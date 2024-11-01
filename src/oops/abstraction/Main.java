package oops.abstraction;

public class Main {
    public static void main(String[] args) {
//        Animal a = new Animal(); // abstract class cannot be instantiated - restricted class
        Cow cow = new Cow();
        Kangaroo kan = new Kangaroo();

        cow.walk(); // impure abstraction - using abstract class
        kan.walk(); // impure abstraction - using abstract class

        cow.eats(); // pure abstraction - using interfaces
        kan.eats(); // pure abstraction - using interfaces
    }
}

abstract class Animal {
    Animal() {
        System.out.println("Animal object is being instantiated...");
    }

    abstract void color(); // abstract method

     public void walk() { // non - abstract method
         System.out.println("Animal walks on 4 legs");
     }
}

/// In Java, using interfaces we can achieve multi-level inheritance
interface Herbivorous {
    void eats(); // body is not there in interfaces , it is final, static and abstract
}

interface Carnivorous {
    void eats(); // body is not there in interfaces , it is final, static and abstract
}
class Cow extends Animal implements Herbivorous {
    Cow() {
        System.out.println("Cow object instantiated.");
    }

    @Override
    void color() {

    }

    @Override
    public void walk() {
        System.out.println("Cow walks on 4 legs");
    }

    @Override
    public void eats() {
        System.out.println("Cow eats only veg food.");
    }
}

class Kangaroo extends Animal implements Carnivorous {
   Kangaroo() {
        System.out.println("Kangaroo object instantiated.");
    }

    @Override
    void color() {

    }

    @Override
    public void walk() {
        System.out.println("Kangaroo walks on 2 legs");
    }

    @Override
    public void eats() {
        System.out.println("Kangaroo eats both veg and non-veg food.");
    }
}