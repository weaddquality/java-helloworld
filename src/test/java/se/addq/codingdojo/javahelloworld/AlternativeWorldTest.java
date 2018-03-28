package se.addq.codingdojo.javahelloworld;

import org.junit.Test;

public class AlternativeWorldTest {

    @Test
    public void assertPrintingAGreeting() {
        AlternativeWorld helloWorld = new AlternativeWorld();
        helloWorld.greeting("Olle");
    }
}
