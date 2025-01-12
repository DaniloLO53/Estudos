package study.viradonojiraya.day1;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        System.out.println("Age:");
        Scanner in = new Scanner(System.in);

        int age = in.nextInt();
        boolean isVIP = false;
        boolean isAuthourized = age >= 18 || isVIP;
        String message = isAuthourized ? "OK" : "NOT OK";

        System.out.println(message);

        if (isAuthourized) {
            System.out.println("Gender:");
            Scanner in2 = new Scanner(System.in);

            switch (in2.nextLine()) {
                case "M":
                    System.out.println("Male and " + message);
                    break;
                case "F":
                    System.out.println("Female and " + message);
                    break;
                default:
                    System.out.println("Other");
            }
        }
    }
}
