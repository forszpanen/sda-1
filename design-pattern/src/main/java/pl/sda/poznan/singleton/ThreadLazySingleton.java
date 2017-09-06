package pl.sda.poznan.singleton;

import pl.sda.poznan.phone.MobilePhone;

public class ThreadLazySingleton {

    private static MobilePhone instance;

    private ThreadLazySingleton() {
        if(instance != null){
            throw new IllegalArgumentException("Already initialized");
        }
    }

    public static synchronized MobilePhone getInstance() {

        if (instance == null) {
            instance = new MobilePhone();
        }

        return instance;
    }
}
