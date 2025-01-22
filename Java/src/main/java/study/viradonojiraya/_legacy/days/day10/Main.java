package study.viradonojiraya._legacy.days.day10;

public class Main {
    public static void main(String[] args) {
        int length = 1_000;

        long start1 = System.currentTimeMillis();
        concatString(length);
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        concatStringBuilder(length);
        long end2 = System.currentTimeMillis();

        long time1 = (end1 - start1);
        long time2 = (end2 - start2);

        double ratio = (double) time2 / time1 * 100;


//        System.out.println("Time with concat: " + time1 + "ms");
//        System.out.println("Time with stringBuilder: " + time2 + "ms");
        System.out.printf("""
                Length: %d
                Ratio: %f 
                """, length, ratio);
    }

    private static void concatString(int length) {
        String text = "";
        for (int i = 0; i < length; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int length) {
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < length; i++) {
            text.append(i);
        }
    }
}
