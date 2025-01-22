package study.viradonojiraya._legacy.days.day1;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // primitivos
        int age = 28;
        long hours = 24 * 365 * age;
        double height = 1.77;
        float weight = 64.56f;
        byte byteNumber = 127;
        boolean employed = false;
        char gender = 'M';

        // casting
        int castedLong = (int) 10000000000L;
        float castedDouble = (float) 1.7D;

        System.out.println(castedLong); // ele corta os bits até long caber dentro do int. Por isso o número estranho
        System.out.println(castedDouble);
    }
}
