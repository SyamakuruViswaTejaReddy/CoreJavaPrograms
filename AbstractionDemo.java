public abstract class AbstractionDemo {
    // Abstract method to be implemented by subclasses
    public abstract void display();
    // Another abstract method to be implemented by subclasses
    public abstract void print();
    // Concrete method that can be used by subclasses
    public void show() {
        System.out.println("This is a concrete method in the abstract class.");
    }
}
