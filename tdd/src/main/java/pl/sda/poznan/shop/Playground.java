package pl.sda.poznan.shop;
public class Playground{
    class Customer
    {
        public String FirstName ;
        public String LastName ;

        public Customer(String firstName, String lastName)
        {
            if (firstName == null) throw new IllegalArgumentException();
            if (lastName == null) throw new IllegalArgumentException();

            FirstName = firstName;
            LastName = lastName;
        }
    }
}
