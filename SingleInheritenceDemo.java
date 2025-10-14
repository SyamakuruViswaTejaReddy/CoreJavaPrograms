public class SingleInheritenceDemo {
    // Base class
    public class Animal {
        public void eat() {
            System.out.println("Animal is eating");
        }
    }

    // Derived class
    public class Dog extends Animal {
        public void bark() {
            System.out.println("Dog is barking");
        }
    }
    public static void main(String[] args) {
        // Create an instance of the derived class
        Dog dog = new SingleInheritenceDemo().new Dog();
        
        // Call methods from both the base and derived classes
        dog.eat();  // Inherited method from Animal
        dog.bark(); // Method from Dog
    }
}
