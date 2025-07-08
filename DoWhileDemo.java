public class DoWhileDemo {
    public static void main(String[] args) {
        int count = 1;

        // Using a do-while loop to print numbers from 1 to 5
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);

        // Demonstrating a condition that will not execute
        int number = 10;
        do {
            System.out.println("This will not print: " + number);
            number++;
        } while (number < 5);
    }
}
