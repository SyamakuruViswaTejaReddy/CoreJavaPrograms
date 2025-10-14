public class StringPreDefinedMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Using length() method to get the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Using charAt() method to get a character at a specific index
        char firstChar = str.charAt(0);
        System.out.println("First character: " + firstChar);
        
        // Using substring() method to get a part of the string
        String subStr = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + subStr);
        
        // Using toUpperCase() method to convert the string to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperStr);
        
        // Using toLowerCase() method to convert the string to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerStr);
        // Using contains() method to check if the string contains a substring
        boolean containsWorld = str.contains("World");  
        System.out.println("Does the string contain 'World'? " + containsWorld);
        // Using indexOf() method to find the index of a character
        int indexOfComma = str.indexOf(',');    
        System.out.println("Index of comma: " + indexOfComma);
        // Using replace() method to replace a character in the string
        String replacedStr = str.replace('o', '0'); 
        System.out.println("String after replacing 'o' with '0': " + replacedStr);
        // Using split() method to split the string into an array
        String[] words = str.split(" ");
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }
        // Using trim() method to remove leading and trailing spaces
        String strWithSpaces = "   Hello, World!   ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");
        // Using equals() method to compare two strings
        String anotherStr = "Hello, World!";
        boolean isEqual = str.equals(anotherStr);
        System.out.println("Is the original string equal to another string? " + isEqual);
        // Using startsWith() method to check if the string starts with a specific prefix
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Does the string start with 'Hello'? " + startsWithHello);
        // Using endsWith() method to check if the string ends with a specific suffix   
        boolean endsWithExclamation = str.endsWith("!");
        System.out.println("Does the string end with '!'? " + endsWithExclamation);
        // Using valueOf() method to convert different data types to a string
        int number = 123;
        String numberStr = String.valueOf(number);
        System.out.println("String representation of number: " + numberStr);
        // Using isEmpty() method to check if the string is empty
        String emptyStr = "";
        boolean isEmpty = emptyStr.isEmpty();
        System.out.println("Is the empty string actually empty? " + isEmpty);
        // Using format() method to format a string with placeholders
        String formattedStr = String.format("Formatted number: %.2f", 123.456);
        System.out.println(formattedStr);
        // Using compareTo() method to compare two strings lexicographically
        String str1 = "apple";  
        String str2 = "banana";
        int comparisonResult = str1.compareTo(str2);    
        if (comparisonResult < 0) {
            System.out.println(str1 + " is lexicographically less than " + str2);
        } else if (comparisonResult > 0) {
            System.out.println(str1 + " is lexicographically greater than " + str2);
        } else {
            System.out.println(str1 + " is equal to " + str2);
        }
        // Using join() method to join an array of strings into a single string
        String[] fruits = {"Apple", "Banana", "Cherry"};    
        String joinedFruits = String.join(", ", fruits);
        System.out.println("Joined fruits: " + joinedFruits);   
        // Using toCharArray() method to convert the string to a character array
        char[] charArray = str.toCharArray();
        System.out.println("Character array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        System.out.println(); // New line after printing character array
        // Using lastIndexOf() method to find the last occurrence of a character        
        int lastIndexOfO = str.lastIndexOf('o');
        System.out.println("Last index of 'o': " + lastIndexOfO);
      
    }
}
