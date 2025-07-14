public class TreeMapDemo {
    public static void main(String[] args) {
        // Create a TreeMap to store student names and their grades
        java.util.TreeMap<String, Integer> studentGrades = new java.util.TreeMap<>();

        // Adding entries to the TreeMap
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);

        // Display the TreeMap
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
