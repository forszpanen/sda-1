package pl.sda.poznan.iterator;

import org.junit.Test;
import pl.sda.poznan.commons.model.Employee;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public class EmployeeCollectionTest {
    @Test
    public void iterator() throws Exception {
        EmployeeCollection employees = new EmployeeCollection();
        employees.forEach(System.out::println);


        EmployeeContainer employeeContainer = new EmployeeContainer();
        Iterator<Employee> iterator = employeeContainer.getIterator();
        while (iterator.hasNext()) {
            Employee next = iterator.next();
            System.out.println(next);
        }

        BitSet bitSet = new BitSet(8);
        bitSet.set(7);
        bitSet.set(6);

        Map<String, String> map = new HashMap<>();


        System.out.println(bitSet);

    }

}