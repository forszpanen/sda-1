package pl.sda.poznan.chor;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoggerFacadeTest {
    @Test
    public void should_log() throws Exception {
        LoggerFacade.log(LogLevel.INFO, "chor rocks");
        LoggerFacade.log(LogLevel.ERROR, "chor rocks");
        LoggerFacade.log(LogLevel.DEBUG, "chor rocks");
        LoggerFacade.log(LogLevel.SUPER_ERROR, "chor rocks");


    }

}