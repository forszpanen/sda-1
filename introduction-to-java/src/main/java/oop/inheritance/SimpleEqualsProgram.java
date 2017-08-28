package oop.inheritance;

public class SimpleEqualsProgram {
    public static void main(String[] args) {
        Osoba os1 = new Osoba();
        os1.setPesel(1234);

        Osoba os2 = new Osoba();
        os2.setPesel(1234);

        String str = "Nowak";

        if (os1.equals(str)) {
            System.out.println("To ta sama osoba");
        } else {
            System.out.println("Dwie rozne osoby");
        }
    }
}
