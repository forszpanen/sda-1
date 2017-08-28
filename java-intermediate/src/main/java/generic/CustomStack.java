package generic;

import java.io.Serializable;
import java.lang.reflect.Array;

public class CustomStack<T> {


    //wskazuje na wierzcholek stosu
    private int index = 0;
    private int size=0;
    T[] stack;

    //utworzyc konstruktor ktory przyjmuje max rozmiar dla stosu
    public CustomStack(Class<T> t, int size){
        stack = (T[]) Array.newInstance(t, size);
        this.size = size;
    }

    public void foo(){

        T type = null;


    }

    //metoda odkladania na stos (dodawania do tablicy)
    public void push(T t){
        if(t == null){
            throw new IllegalArgumentException("Argument cannot be null");
        }
        //sprawdzamy, czy mozna odlozyc na stos (czy nie zostal przekroczony maksymalny rozmiar)
        if(index < size){
            stack[index] = t;
            index++;
        }else {
            throw new ArrayIndexOutOfBoundsException("Stos jest pelny - nie mozna dodac");
//            System.out.println("Stos pelny");
        }

    }

    //usuwanie z tablicy
    public T pop(){
        if(index>0){
            T element = stack[--index];
            stack[index] = null;
            return element;
        }else{
            throw new ArrayIndexOutOfBoundsException("Stos jest pusty");
        }

    }

}
