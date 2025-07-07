public class TypeConversions {
    public static void main(String[] args) {
        // Example of type conversions in Java
        int intValue = 100;
        double doubleValue = intValue; // Implicit/Widening conversion from int to double
        System.out.println("Int to Double: " + doubleValue);

        double anotherDouble = 123.456;
        int convertedInt = (int) anotherDouble; // Explicit/narrowing conversion from double to int
        System.out.println("Double to Int: " + convertedInt);

        float floatValue = 10.5f;
        long longValue = (long) floatValue; // Explicit conversion from float to long
        System.out.println("Float to Long: " + longValue);
    }
}
