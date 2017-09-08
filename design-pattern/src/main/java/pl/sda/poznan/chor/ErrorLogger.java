package pl.sda.poznan.chor;

public class ErrorLogger extends Logger {

    public ErrorLogger() {
        this.logLevel = LogLevel.ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
