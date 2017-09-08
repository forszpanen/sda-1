package pl.sda.poznan.chor;

public abstract class Logger {
    protected LogLevel logLevel;
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(LogLevel logLevel, String message) {
        //jezeli poziom logowania niszy niz moj to zaloguj
        if (this.logLevel.ordinal() >= logLevel.ordinal()) {
            write(message);
        }
        //else
        //przenies wyzej
        else if (nextLogger != null) {
            nextLogger.logMessage(logLevel, message);
        }else {
            System.out.println("ZADANIE NIE OBSLUZONE");
        }
    }


    protected abstract void write(String message);

}
