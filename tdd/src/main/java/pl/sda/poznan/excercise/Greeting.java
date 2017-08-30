package pl.sda.poznan.excercise;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Greeting {
    public String greet(String... names) {
        if (names == null) {
            return "Hello, my friend";
        }
        if (names.length == 1) {
            String name = names[0];
            if (name.equals(name.toUpperCase())) {
                return "HELLO " + name;
            }
            return "Hello, " + name;
        }

        String result = "Hello";
        for(int i = 0; i< names.length; i++){
            if(i == names.length -1){
                result += " and " + names[i];
            }else {
                result += ", " +  names[i];
            }
        }

        return result;
    }
}

