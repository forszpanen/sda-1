package oop.company;


public class Company {

    private String name;
    private Employee[] employees;
    private int numberOfEmployees;

    public Company() {
        employees = new Employee[10];
        numberOfEmployees = 0;
    }


    //napisac metode ktora wyswietli wszystkich pracownikow
    public void printEmployeesBad() {
        for (Employee emp : employees) {
            emp.describeEmployee();
        }
    }

    //Poprawna wersja bez bledu
    public void printEmployees(){
        if(numberOfEmployees == 0){
            System.out.println("Brak pracownikow");
        }else{
            for(int i = 0; i< numberOfEmployees; i++){
                Employee emp = employees[i];
                emp.describeEmployee();
            }
        }

    }

    public double countAverageSalary(){
        //policzyc srednia pensje dla pracownikow
        return 0;
    }
    public double countAverageAge(){
        //policzyc sredni wiek dla pracownikow
        return 0;
    }

    public void getEmployeeWithHigestSalary(){
        //znalezc pracownika z najwieksza wyplata
    }

    //Metoda do dodawania pracownika do tablica pracownikow
    public void addEmployee(Employee nextEmployee) {
        employees[numberOfEmployees] = nextEmployee;
        numberOfEmployees++;
    }
}
