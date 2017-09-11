package pl.sda.poznan.iterator;

import pl.sda.poznan.commons.model.Employee;

import java.util.Iterator;

public class EmployeeCollection implements Iterable<Employee> {
    private Employee[] employees = {new Employee(), new Employee(), new Employee(), new Employee(), new Employee()};

    @Override
    public Iterator<Employee> iterator() {
        return new Iterator<Employee>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < employees.length;
            }

            @Override
            public Employee next() {
                return hasNext() ? employees[index++] : null;
            }
        };
    }
}
