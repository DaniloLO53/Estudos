package study.viradonojiraya.day8.POC.service;

import study.viradonojiraya.day8.POC.domain.Employee;
import study.viradonojiraya.day8.POC.domain.LoginInvalidException;
import study.viradonojiraya.day8.POC.domain.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        try {
            div(1, 0);
            createNewFile();
        } catch (IllegalArgumentException | IOException e) {
            System.out.println("CATCH");
            e.printStackTrace();
        }
    }

    private static void createNewFile() throws IOException {
        File file = new File("text.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
            throw e; // we can even throw an exception inside the catch clause.
        }
    }

    // When we declare "throws" on the method's head, we don't need to handle the exception (even through we can).
    // Instead, we delegate this responsibility to the caller of the method.
    public static int div(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Ilegal, mané");
        }
        return a/b;
    }
}
