public class AbstractAnonymousInnerClassDemo {
    // Abstract class
    abstract static class Animal {
        abstract void sound();
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
