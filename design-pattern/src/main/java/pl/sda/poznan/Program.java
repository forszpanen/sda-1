package pl.sda.poznan;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Program {
    public static void main(String[] args) {
        log.info("System running");


        ExampleInterface ex = arg -> System.out.println(arg);

        ex.doSth("Konkretny argumet");
    }
}
