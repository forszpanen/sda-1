package func;

import pl.sda.poznan.commons.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeOperations {

    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeOperations() {
        Employee first = new Employee("Piotr", "Nowak", 20, 3500);
        Employee john = new Employee("Piotr", "Kowalski", 20, 1500);
        Employee tim = new Employee("Piotr", "Adamiak", 20, 2400);
        Employee jack = new Employee("Piotr", "Nowacki", 20, 2600);
        Employee red = new Employee("Piotr", "Markowski", 20, 8000);
        Employee charming = new Employee("Piotr", "Kowal", 20, 4200);
        Employee good = new Employee("Piotr", "Nowakowski", 20, 5400);

        employeeList.add(first);
        employeeList.add(john);
        employeeList.add(tim);
        employeeList.add(jack);
        employeeList.add(red);
        employeeList.add(charming);
        employeeList.add(good);
    }

    public void printAll() {

        employeeList.forEach(employee -> System.out.println(employee));
        employeeList.forEach(System.out::println);
    }

    //wypisz wszystkich pracownikow z wyplata wyzsza niz:
    public void printAllWithHighSalary() {
//        for(Employee emp : employeeList){
//            if(emp.getSalary() > 3000){
//                System.out.println(emp);
//            }
//        }

        employeeList.forEach(emp -> {
            if (emp.getSalary() > 2500)
                System.out.println(emp);
        });

    }

    //z uzyciem forEach zliczyc pracownikow z wyplata > 2500
    public void printNumber() {
//        int count = 0;
//        for(Employee emp : employeeList){
//            if(emp.getSalary()>2500){
//                count++;
//            }
//        }
//
//        System.out.println("Zliczonych pracownikow: " + count);


        final int[] count = {0};
        final int[] arr = new int[1];
        arr[0] = 0;

        employeeList.forEach(emp -> {
            if (emp.getSalary() > 2500) {
                arr[0]++;
            }
        });

        System.out.println(count[0]);
    }

    //metoda zwracajaca liczbę pracowników z wyplata wieksza niz
    public long streamsFilter(double salary) {
        long count = employeeList.stream().filter(employee -> employee.getSalary() > salary).count();
        return count;
    }

    public List<Employee> getEmployeesWithSalary(double salary) {
        List<Employee> result = employeeList.stream()
                .filter(employee -> employee.getSalary() > salary)
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());

        Stream<Employee> employeeStream = employeeList.stream().filter(e -> e.getSalary() > salary);
        Stream<Employee> sorted = employeeStream.sorted(Comparator.comparing(Employee::getSalary));
        List<Employee> collect = sorted.collect(Collectors.toList());

        return result;
    }
}
