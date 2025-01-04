package study.viradonojiraya.day1;

public class Arrays {
    public static void main(String[] args) {
        // valores padrões:
        // byte, short, int, long, float e double: 0
        // char: '\u0000'
        // String null
        double score1 =  77.5;
        double score2 =  47.5;
        double score3 =  90;

        double[] scores = new double[3]; // é criado com os valores padrões
        scores[0] = score1;
        scores[1] = score2;
        scores[2] = score3;

        String[] names = {"Dan", "Ralph", "Cassie", "Elian", "Adel", "Carmel"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        for(String name: names) {
            System.out.println(name);
        }
    }
}
