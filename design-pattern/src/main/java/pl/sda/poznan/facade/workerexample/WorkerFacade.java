package pl.sda.poznan.facade.workerexample;

import java.util.ArrayList;
import java.util.List;

public class WorkerFacade {
    private List<Worker> workerList = new ArrayList<>();

    public void addWorker(Worker w) {
        workerList.add(w);
    }

    public void startWorkingDay() {
        for (Worker w : workerList) {
            System.out.println(w.getName() + " is starting work");
            w.startWork();
        }
    }


}
