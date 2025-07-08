public class StringBuilderDemo {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append strings to the StringBuilder
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");

        // Convert StringBuilder to String and print it
        String result = sb.toString();
        System.out.println(result); // Output: Hello World!

        // Demonstrating capacity and length
        System.out.println("Capacity: " + sb.capacity()); // Default capacity is 16
        System.out.println("Length: " + sb.length()); // Length of the current string
    }
}
