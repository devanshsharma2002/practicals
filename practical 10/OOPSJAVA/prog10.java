// Base class 1
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

// Base class 2
class Bird {
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

// Derived class inheriting from both Animal and Bird
class Eagle extends Animal {
    public void hunt() {
        System.out.println("Eagle is hunting.");
    }
}

public class prog10 {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        // Accessing methods from both base classes
        eagle.eat(); // Calls Animal's eat()
        // Calling the derived class method
        eagle.hunt(); // Calls Eagle's hunt()
    }
}
