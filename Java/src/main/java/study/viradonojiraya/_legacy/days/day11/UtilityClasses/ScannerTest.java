package study.viradonojiraya._legacy.days.day11.UtilityClasses;

public class ScannerTest {
    public static void main(String[] args) {
        String names = "Danilo, Cássia, Camila";
        String[] arrNames = names.split(",");

        for(String name: arrNames) {
            System.out.println(name.trim());
        }
    }
}
