package pl.sda.poznan.singleton;

import pl.sda.poznan.phone.MobilePhone;

public class LazySingleton {
    private static MobilePhone instance;


    private LazySingleton(){}

    public static MobilePhone getInstance(){
        if(instance == null){
            instance = new MobilePhone();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
