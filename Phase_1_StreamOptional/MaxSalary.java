package Phase_1_StreamOptional;

import java.util.List;
import java.util.Optional;

public class MaxSalary {
public static void main(String[] args) {
    List<Employee> employees=List.of(new Employee("Alice",30,70000),
                                     new Employee("Bob",25,50000),
                                     new Employee("Charlie",35,80000),
                                     new Employee("David",28,60000));
Optional<Employee> maxSalary= employees.stream()
         .reduce((e1,e2)->e1.getSalary()>e2.getSalary()?e1:e2);
 System.out.println("Employee with max salary:"+maxSalary.map(Employee::getName).orElse("No employees") );
}
}