package pl.sda.poznan.demo.a;

/**
 * @author Piotrek
 */
public class Programv2 {
    public static void main(String[] args) {
        Person p = new Person();
        Person secondName = p;

        p.setName("Piotr");

        System.out.println(secondName.getName());
        StringBuilder sb = new StringBuilder().append("wiekKota").append(":").append(1).append('r');
        System.out.println(sb);//wiekKota:1r
    }
}
