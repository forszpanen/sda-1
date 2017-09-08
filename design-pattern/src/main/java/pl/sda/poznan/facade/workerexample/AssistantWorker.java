package pl.sda.poznan.facade.workerexample;

public class AssistantWorker extends AbstractWorker {

    public String createReports() {
        System.out.println("Creating reports...");
        return "stazysta ciezko pracuje";
    }
}
