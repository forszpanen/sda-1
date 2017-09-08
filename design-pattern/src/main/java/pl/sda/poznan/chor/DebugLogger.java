package pl.sda.poznan.chor;

public class DebugLogger extends Logger {
    public DebugLogger() {
        this.logLevel = LogLevel.DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}
