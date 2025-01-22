package study.viradonojiraya._legacy.days.day8.ErrorsAndExceptions.service;

import java.io.File;
import java.io.IOException;

public class RuntimeException {
    public static void main(String[] args) {
        // there are checked and unchecked exceptions in Java. An unchecked exception is a child of RuntimeException (
        // which is a child of Exception). We don't need to validate in order to code to compile
        // On the other hand, a checked exception is a child of Exception class.
        // An Exception class is a child of Throwable class, as well as the Error class.
//        createNewFile1();
        div(1, 0);
    }

    // unchecked
    private static int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Illegal argument...");
        }
        System.out.println("Hey"); // it's not called if threw an Exception
        return a/b;
    }

    // checked
    private static void createNewFile1() {
        File file = new File("aba/test.txt");
//        file.createNewFile(); // here we need to handle the exception (a checked exception)
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Achieve is created: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("createNewFile"); // it's called even with an Exception
    }

    // the method that use this method need to handle the exception
    public static void createNewFile2() throws IOException {
        File file = new File("aba/test.txt");
        boolean isCreated = file.createNewFile();
        System.out.println("Achieve is created: " + isCreated);
    }

    public static void createNewFile3() throws IOException {
        File file = new File("aba/test.txt");
//        file.createNewFile(); // here we need to handle the exception (a checked exception)
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Achieve is created: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
            throw e; // we throw even handling exception. Here we don't need the "new" keyword, as we're not creating
            // a brand-new exception, we're throwing  the exception e
        }
        System.out.println("createNewFile"); // it's called even with an Exception
    }

    private static void createNewFile4() {
        File file = new File("aba/test.txt");
//        file.createNewFile(); // here we need to handle the exception (a checked exception)
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Achieve is created: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }
}
