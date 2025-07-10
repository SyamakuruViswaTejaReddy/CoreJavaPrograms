public class ThisSuperFinalDemo {
    private int value;
    private static final int CONSTANT = 100;
    private String name;
    // Constructor
    public ThisSuperFinalDemo(int value, String name) {
        this.value = value; // 'this' refers to the current instance variable
        this.name = name;
    }   
    // Method to display values
    public void display() {
        System.out.println("Value: " + this.value); // 'this' is optional here
        System.out.println("Name: " + this.name);
        System.out.println("Constant: " + CONSTANT); // Accessing static final variable
    }
    // Method to demonstrate 'super' keyword
    public void showSuper() {
        System.out.println("Super method called from: " + this.name);
    }   
    // Static method to demonstrate 'final' keyword
    public static void showFinal() {    
        System.out.println("This is a final method. Constant value: " + CONSTANT);
    }
    // Main method to test the class
    public static void main(String[] args) {
        ThisSuperFinalDemo demo = new ThisSuperFinalDemo(42, "Demo Instance");
        demo.display(); // Display instance values
        demo.showSuper(); // Call method demonstrating 'super'
        ThisSuperFinalDemo.showFinal(); // Call static method demonstrating 'final'
    }
}
