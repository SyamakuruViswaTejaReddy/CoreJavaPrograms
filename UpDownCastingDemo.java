public class UpDownCastingDemo {
    // Base class
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Derived class
    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    // Another derived class
    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Animal myDog = new Dog(); // Upcasting
        Animal myCat = new Cat(); // Upcasting

        myDog.sound(); // Calls Dog's sound method
        myCat.sound(); // Calls Cat's sound method

        // Downcasting
        Dog downcastedDog = (Dog) myDog; // Safe downcasting
        downcastedDog.sound(); // Calls Dog's sound method

        // Uncommenting the next line will cause a ClassCastException at runtime
        // Cat downcastedCat = (Cat) myDog; // Unsafe downcasting, will throw an exception
    }
}
