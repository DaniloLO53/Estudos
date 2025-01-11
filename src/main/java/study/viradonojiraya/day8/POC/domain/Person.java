package study.viradonojiraya.day8.POC.domain;

import java.io.FileNotFoundException;

public class Person {
    // here we're saying to compiler what can go wrong. In this case, it can deal with a file
    // that doesn't exist. So we throw an object of the FileNotFoundException class
    public void save() throws FileNotFoundException {
        System.out.println("Saving person...");
    }
}
