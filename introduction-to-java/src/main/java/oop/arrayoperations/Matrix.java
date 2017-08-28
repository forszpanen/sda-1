package oop.arrayoperations;
import java.util.Scanner;

public class Matrix {
    private int[][] macierz;
    private int m;
    private int n;

    public int[][] getMacierz() {
        return macierz;
    }

    public void setMacierz(int[][] macierz) {
        this.macierz = macierz;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        this.macierz = new int[m][n];
    }

    //metoda do wypelniania wartosciami
    public void initializeMatrix() {
        // zrobic scannera
        //wczytac elementy do macierzy
        System.out.println("Podaj elementy macierzy");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                macierz[i][j] = sc.nextInt();
            }
        }
    }

    //metoda do wypisywania wartosci
    public void printMatrix() {
        //wypianie elementow na konsole
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
    }

    //this.macierz[i][j] -> obiekt o nazwie macierz1
    //argument to macierz2 -> przychodzi z zewnatrz
    //zwracamy wynikowa macierz

    public Matrix addMatrix(Matrix drugaMacierz) {
        Matrix wynikowa = new Matrix(m, n);
        if (this.m == drugaMacierz.getM() && this.n == drugaMacierz.getN()) {


            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    wynikowa.macierz[i][j] = this.macierz[i][j] + drugaMacierz.macierz[i][j];
                }
            }

            return wynikowa;
        } else {
            //zwroci pusta macierz
            return wynikowa;
            //lub return null; -> wtedy w przypadku dodawania dwoch macierzy o roznych
            //wymiarach zostanie zwrocony null (moze sie pojawic null pointer exception)
        }


    }

    //napisac metode do odejmowania dwoch macierzy
    public Matrix substractMatrix(Matrix drugaMacierz) {
        Matrix wynikowa = new Matrix(m, n);
        if (this.m == drugaMacierz.getM() && this.n == drugaMacierz.getN()) {


            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    wynikowa.macierz[i][j] = this.macierz[i][j] - drugaMacierz.macierz[i][j];
                }
            }

            return wynikowa;
        } else {
            //zwroci pusta macierz
            return wynikowa;
            //lub return null; -> wtedy w przypadku dodawania dwoch macierzy o roznych
            //wymiarach zostanie zwrocony null (moze sie pojawic null pointer exception)
        }

    }

}
