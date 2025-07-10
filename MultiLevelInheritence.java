public class MultiLevelInheritence {
    // Base class
    public class Animal {
        public void eat() {
            System.out.println("Animal is eating");
        }
    }

    // Intermediate class
    public class Dog extends Animal {
        public void bark() {
            System.out.println("Dog is barking");
        }
    }

    // Derived class
    public class Puppy extends Dog {
        public void weep() {
            System.out.println("Puppy is weeping");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the derived class
        Puppy puppy = new MultiLevelInheritence().new Puppy();
        
        // Call methods from all classes in the hierarchy
        puppy.eat();  // Inherited from Animal
        puppy.bark(); // Inherited from Dog
        puppy.weep(); // Method from Puppy
    }
}