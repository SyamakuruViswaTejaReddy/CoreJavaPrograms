public class AnonymousInnerClass {
    // Base class
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    public static void main(String[] args) {
        // Anonymous inner class extending Animal
        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Dog barks");
            }
        };

        // Anonymous inner class extending Animal
        Animal cat = new Animal() {
            @Override
            void sound() {
                System.out.println("Cat meows");
            }
        };

        dog.sound(); // Calls Dog's sound method
        cat.sound(); // Calls Cat's sound method
    }
}
