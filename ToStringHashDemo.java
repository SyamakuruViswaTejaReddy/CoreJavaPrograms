public class ToStringHashDemo {
    // Class with overridden toString and hashCode methods
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + '}';
        }

        @Override
        public int hashCode() {
            return name.hashCode() + age;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person); // Calls toString method
        System.out.println("Hash code: " + person.hashCode()); // Calls hashCode method
    }
}
