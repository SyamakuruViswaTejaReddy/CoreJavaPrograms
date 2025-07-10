public class MethodOverriding {
// Base class
static class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
// Derived class Dog
static class Dog extends Animal {  
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
// Derived class Cat
static class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
    public static void main(String[] args) {
        System.out.println("Method Overriding Example");
        
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.sound(); // Calls Dog's sound method
        myCat.sound(); // Calls Cat's sound method
    }
    
}
