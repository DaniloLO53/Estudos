package study.random.Collections.COL1;

public class Main {

    public static void main(String[] args) {
        Smartphone motorola = new Smartphone("AA21", "Motorola", "8");
        Smartphone iphone = new Smartphone("AA22", "Iphone", "16");

        String s1 = "A";
        String s2 = "A";
        StringBuilder s3 = new StringBuilder("A");

        System.out.println(motorola.equals(iphone));
        System.out.println(s1.equals(s3));

    }
}
