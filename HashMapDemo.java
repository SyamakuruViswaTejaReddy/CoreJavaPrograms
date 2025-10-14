public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their grades
        java.util.HashMap<String, Integer> studentGrades = new java.util.HashMap<>();

        // Adding entries to the HashMap
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);

        // Display the HashMap
        System.out.println("Student Grades: " + studentGrades);

        // Accessing a value using a key
        int aliceGrade = studentGrades.get("Alice");
        System.out.println("Alice's Grade: " + aliceGrade);

        // Checking if a key exists
        if (studentGrades.containsKey("Bob")) {
            System.out.println("Bob's Grade: " + studentGrades.get("Bob"));
        }

        // Removing an entry
        studentGrades.remove("Charlie");
        System.out.println("After removing Charlie: " + studentGrades);
    }
}
