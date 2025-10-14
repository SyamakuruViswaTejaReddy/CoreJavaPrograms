public class InnerClass {
    // Outer class
    static class Outer {
        private String outerField = "Outer field";

        // Inner class
        class Inner {
            void display() {
                System.out.println("Accessing: " + outerField);
            }
        }

        void createInner() {
            Inner inner = new Inner();
            inner.display();
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.createInner(); // This will create an instance of Inner and call its display method
    }
}
