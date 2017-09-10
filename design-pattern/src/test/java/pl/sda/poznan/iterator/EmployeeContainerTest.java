package pl.sda.poznan.iterator;

import org.junit.Test;
import pl.sda.poznan.commons.model.Employee;

import static org.junit.Assert.*;

public class EmployeeContainerTest {
    @Test
    public void test(){
        EmployeeContainer ec = new EmployeeContainer();

        Iterator<Employee> iterator = ec.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}