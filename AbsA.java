public class AbsA extends AbstractionDemo {
    // Implementing the abstract method display
    @Override
    public void display() {
        System.out.println("Display method implemented in AbsA.");
    }

    // Implementing the abstract method print
    @Override
    public void print() {
        System.out.println("Print method implemented in AbsA.");
    }
    public static void main(String[] args) {
        AbsA obj = new AbsA();
        AbstractionDemo absObj = new AbsA(); // Upcasting to the abstract class type
        // Using the object of AbsA to call methods
        absObj.display();
        obj.display(); // Calls the display method
        obj.print();   // Calls the print method
        obj.show();    // Calls the concrete method from the abstract class
    }
    
}
