package pl.sda.poznan.math;

public class MathHelper {
    public static int Factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * Factorial(n-1);
    }
}
