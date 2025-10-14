public class AnonymousObject {
    // Method that takes an anonymous object as a parameter
    public void displayMessage(AnonymousObject obj) {
        System.out.println("Anonymous object method called");
    }

    // Main method to test the anonymous object
    public static void main(String[] args) {
        // Creating an anonymous object and calling the method
        new AnonymousObject().displayMessage(new AnonymousObject());
    }
}
