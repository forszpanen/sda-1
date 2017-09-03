package pl.sda.poznan.singleton;

import pl.sda.poznan.phone.MobilePhone;

public class SingleObject {

    private static MobilePhone instance = new MobilePhone();


    private SingleObject(){}

    public static MobilePhone getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
