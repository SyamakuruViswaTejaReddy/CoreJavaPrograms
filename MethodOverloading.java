public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Method Overloading Example");
        System.out.println("Sum of two integers: " + sum(5, 10));
        System.out.println("Sum of three integers: " + sum(5, 10, 15));
        System.out.println("Sum of two doubles: " + sum(5.5, 10.5));
    }

    // Method to add two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public static double sum(double a, double b) {
        return a + b;
    }
}
