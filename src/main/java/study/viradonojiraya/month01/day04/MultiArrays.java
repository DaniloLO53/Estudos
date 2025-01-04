package study.viradonojiraya.month01.day04;

public class MultiArrays {
    public static void main(String[] args) {

        float[][] weightHeight = {{ 89, 1.77F }, { 77, 1.59F }, { 81, 1.92F }};

        for(float[] values: weightHeight) {
            System.out.printf("""
                    Weight: %f
                    Height: %f
                    """, values[0], values[1]);
        }
    }
}