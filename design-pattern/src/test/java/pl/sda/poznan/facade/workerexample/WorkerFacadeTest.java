package pl.sda.poznan.facade.workerexample;

import org.junit.Test;

import javax.swing.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.*;

public class WorkerFacadeTest {
    @Test
    public void tesst() throws FileNotFoundException {
    }

    @Test
    public void test() {
        InternWorker stazysta = new InternWorker();
        AssistantWorker asystent = new AssistantWorker();
        DirectorWorker kierownik = new DirectorWorker();

        WorkerFacade facade = new WorkerFacade();
        facade.addWorker(stazysta);
        facade.addWorker(asystent);
        facade.addWorker(kierownik);

//        Zamiast wywolywac rozpoczecie pracy dla kazdego pracownika z osobna
//        stazysta.startWork();
//        asystent.startWork();
//        kierownik.startWork();

        //korzystamy z fasady, ktora upraszcza rozpoczecie dnia
        facade.startWorkingDay();


        //Fasada upraszcza tylko rozpoczecie pracy
        //Zadania pracownikow sa rozne, wiec sa one wywolywane oddzielnie
        stazysta.prepareDocuments();
        kierownik.giveRaise();
        String reports = asystent.createReports();

        JOptionPane.showMessageDialog(null, reports);

    }

}