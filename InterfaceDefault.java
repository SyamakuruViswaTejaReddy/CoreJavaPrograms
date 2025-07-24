public interface InterfaceDefault {
     void display();
        default void defaultMethod() {
            System.out.println("Default method in InterfaceA");
        }
        static void staticMethod() {
            System.out.println("Static method in InterfaceA");
        }
    } 
