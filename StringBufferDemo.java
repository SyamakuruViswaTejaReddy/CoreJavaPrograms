public class StringBufferDemo {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append a string to the StringBuffer
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert a string at a specific index
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Replace a substring with another string
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // Delete a substring
        sb.delete(2, 7);
        System.out.println("After delete: " + sb);

        // Reverse the StringBuffer
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
