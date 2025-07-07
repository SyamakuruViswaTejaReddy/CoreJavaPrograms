import java.util.Scanner;

public class MyScanner {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a;
    System.out.println("Enter an integer:");
    a = scanner.nextInt();
      System.out.println("You entered: " + a);
    byte bt;
    System.out.println("Enter a byte:");  
      bt = scanner.nextByte();
      System.out.println("You entered: " + bt);
      short s;
      System.out.println("Enter a short:");
      s = scanner.nextShort();
      System.out.println("You entered: " + s);
      long l;
      System.out.println("Enter a long:");
      l = scanner.nextLong();
      System.out.println("You entered: " + l);

      float f;
      System.out.println("Enter a float:");
      f = scanner.nextFloat();
      System.out.println("You entered: " + f);
      System.out.println("You entered: " + a);
      double b;
      System.out.println("Enter a double:");
      b = scanner.nextDouble();

      System.out.println("You entered: " + b);
      String c;
      System.out.println("Enter a string:");
      c = scanner.next();  
      System.out.println("You entered: " + c);

      boolean d;
      System.out.println("Enter a boolean (true/false):");
      d = scanner.nextBoolean();
      System.out.println("You entered: " + d);
      
      char e;
      System.out.println("Enter a character:");
      e = scanner.next().charAt(0);
      System.out.println("You entered: " + e);  
      scanner.close();
      

 }
}
