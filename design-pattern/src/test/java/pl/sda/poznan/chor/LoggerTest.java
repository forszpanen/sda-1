package pl.sda.poznan.chor;

import org.junit.Test;
import sun.rmi.runtime.Log;

import static org.junit.Assert.*;

public class LoggerTest {

    @Test
    public void should_log_message(){
        Logger info = new InfoLogger();
        Logger debug = new DebugLogger();
        Logger error = new ErrorLogger();

        info.setNextLogger(debug);
        debug.setNextLogger(error);



        info.logMessage(LogLevel.SUPER_ERROR, "chor rocks!");
    }
}