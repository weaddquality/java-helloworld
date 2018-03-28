package se.addq.codingdojo.javahelloworld;

public class HelloWorld {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String greeting() {
        return "Hello";
    }

    public HelloWorld(String name) {
        this.name = name;
    }
}
