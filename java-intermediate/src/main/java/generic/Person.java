package generic;

public class Person implements Comparable<Person>{

    private String name;
    private String surname;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void introduce(){
        System.out.println(name + " " + surname);
    }


    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.surname);
//        if(this.age > o.getAge()){
//            return 1;
//        }else if(this.age == o.getAge()){
//            return 0;
//        }else {
//            return -1;
//        }
    }
}
