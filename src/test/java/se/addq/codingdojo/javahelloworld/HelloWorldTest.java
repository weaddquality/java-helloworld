package se.addq.codingdojo.javahelloworld;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void shouldReturnAGreeting() {
        HelloWorld myGreetingClass = new HelloWorld("Kalle");
        System.out.println(myGreetingClass.greeting() + " " + myGreetingClass.getName());
    }

}
