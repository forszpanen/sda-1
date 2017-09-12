package func;

import org.junit.Test;
import pl.sda.poznan.commons.model.Address;
import pl.sda.poznan.commons.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeOperationsTest {
    @Test
    public void getEmployeesWithSalary() throws Exception {
        EmployeeOperations employeeOperations = new EmployeeOperations();
        List<Employee> employeesWithSalary = employeeOperations.getEmployeesWithSalary(4000);
        employeesWithSalary.forEach(System.out::println);
    }

    @Test
    public void streamsTest() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Piotr", "Kowal", 20, 2500));
        employees.add(new Employee("Piotr", "Nowak", 25, 3500));
        employees.add(new Employee("Piotr", "Adamiak", 23, 2700));

        Stream<Employee> employeeStream = employees.stream().filter(x -> x.getSalary() > 2600);

        employees.add(new Employee("Jan", "Testowy", 23, 5000));

        Stream<Employee> employeeStream1 = employeeStream.filter(x -> x.getSalary() < 4500);
        List<Employee> result = employeeStream1.collect(Collectors.toList());

        System.out.println(result.size());
    }

    @Test
    public void mapTest() {
        List<Employee> employees = new ArrayList<>();

        Address jackAddress = new Address("30", "os. Jagiellońskie", "Poznan", "61-229");
        Employee jack = new Employee("Piotr", "Kowal", 20, 2500, jackAddress);


        Address johnAddress = new Address("544", "Dluga", "Wroclaw", "89-800");
        Employee john = new Employee("Piotr", "Nowak", 25, 3500, johnAddress);

        employees.add(jack);
        employees.add(john);

//        List<Address> ...
        List<Address> p1 = employees.stream()
                .map(employee -> employee.getAddress())
                .filter(address -> address.getStreet().startsWith("P"))
                .collect(Collectors.toList());

    }

    @Test
    public void anotherMapExample() {
        List<String> strings = Arrays.asList("Piotr", "Pawel", "Jan", "Aga");

        List<String> collect = strings.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());

    }

}