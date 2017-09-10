package func;

import pl.sda.poznan.commons.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachPlayground {
    public static void main(String[] args) {
        Employee first = new Employee("Piotr", "Kowalski", 20, 2500);
        Employee john = new Employee("Piotr", "Kowalski", 20, 2500);
        Employee tim = new Employee("Piotr", "Kowalski", 20, 2500);
        Employee jack = new Employee("Piotr", "Kowalski", 20, 2500);
        Employee red= new Employee("Piotr", "Kowalski", 20, 2500);
        Employee charming = new Employee("Piotr", "Kowalski", 20, 2500);
        Employee good = new Employee("Piotr", "Kowalski", 20, 2500);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(first);
        employeeList.add(john);
        employeeList.add(tim);
        employeeList.add(jack);
        employeeList.add(red);
        employeeList.add(charming);
        employeeList.add(good);

        List<Integer> collect = employeeList.stream().map(e -> e.getAge()).collect(Collectors.toList());
        collect.forEach(i -> System.out.println("i"));

    }
}
