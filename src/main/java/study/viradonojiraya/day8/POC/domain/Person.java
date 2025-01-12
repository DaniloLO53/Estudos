package study.viradonojiraya.day8.POC.domain;

import java.io.FileNotFoundException;

public class Person {
    public static void main(String[] args) {
        div(1, 0);
    }

    private static int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Ilegal, mané");
        }
        return a/b;
    }
    // here we're saying to compiler what can go wrong. In this case, it can deal with a file
    // that doesn't exist. So we throw an object of the FileNotFoundException class
    public void save() throws FileNotFoundException {
        System.out.println("Saving person...");
    }
}
