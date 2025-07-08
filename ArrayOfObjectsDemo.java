public class ArrayOfObjectsDemo {
    public static void main(String[] args) {
        // Creating an array of objects
        Person[] people = new Person[3];
        
        // Initializing the objects in the array
        people[0] = new Person("Alice", 30);
        people[1] = new Person("Bob", 25);
        people[2] = new Person("Charlie", 35);
        
        // Printing the details of each person
        for (Person person : people) {
            System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        }
    }
    public static class Person {
        private String name;
        private int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Getter for age
        public int getAge() {
            return age;
        }
    }
}
