public class WhileDemo {
    public static void main(String[] args) {
        int count = 1;

        // Using a while loop to print numbers from 1 to 5
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Demonstrating a condition that will not execute
        int number = 10;
        while (number < 5) {
            System.out.println("This will not print: " + number);
            number++;
        }
    }
}
