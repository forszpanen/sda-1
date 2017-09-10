package pl.sda.poznan.iterator;

import pl.sda.poznan.commons.model.Employee;

public class EmployeeContainer implements Container<Employee> {
    private Employee[] employees = new Employee[]{new Employee(), new Employee(), new Employee()};

    //Annonymous class to return custom Iterator
    @Override
    public Iterator<Employee> getIterator() {
        return new Iterator<Employee>() {
            int index;
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
