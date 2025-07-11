public class WrapperClassesDemo {
    public static void main(String[] args) {
        // Example of using wrapper classes
        Integer intValue = Integer.valueOf(10);
        Double doubleValue = Double.valueOf(20.5);
        Boolean boolValue = Boolean.valueOf(true);
      
        // Displaying the values
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Boolean value: " + boolValue);

        // Autoboxing and unboxing
        int primitiveInt = intValue; // Unboxing
        Integer wrappedInt = primitiveInt; // Autoboxing

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);
    }
}
