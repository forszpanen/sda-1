package generic;

public class PersonStack<T extends Person & Workable> {
    T myType;



    public void foo(){
        myType.introduce();

    }
}
