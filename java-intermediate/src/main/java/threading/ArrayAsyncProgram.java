package threading;

import java.util.Random;

public class ArrayAsyncProgram {
    public static void main(String[] args) throws InterruptedException {

        int ARRAY_SIZE = 1000;
        double[] arr = new double[ARRAY_SIZE];
        Random r = new Random();

        for(int i =0; i < arr.length; i++){
            arr[i] = r.nextDouble();
        }


        ArrayAsync async = new ArrayAsync(arr, 4);

        double v = async.StartCalculations();

        System.out.println("Wynik sumowania tablicy na watkach: " + v);
    }
}
