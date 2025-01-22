package study.viradonojiraya._legacy.days.day3.domain.staticModifiers;

public class StaticInitializationBlocks {
    private String name;
    private static double[] grades;

    // Compilation order:
    // 0 - Static initialization blocks are executed when JVM loads the class
    // 1 - Memory allocation to object
    // 2 - Each class's attribute is created and initiated with default values or with the values passed
    // 3 - Non-static initialization blocks are executed
    // 4 - Constructor is executed

    // static initialization blocks are executed once
    static {
        System.out.println("Inside static initialization block 1");
//        grades = new double[100];
//        for (int index = 0; index < grades.length; index++) {
//            grades[index] = index + 1;
//            System.out.println("Grade: " + grades[index]);
//        }
    }
    // non-static initialization blocks are executed for each class's instance
    {
        System.out.println("Inside non-static initialization block");
    }
    static {
        System.out.println("Inside static initialization block 2");
    }
    public StaticInitializationBlocks(String name) {
        System.out.println("Inside name constructor");
        this.name = name;
    }

    public StaticInitializationBlocks() {
        System.out.println("Inside empty constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double[] getGrades() {
        return grades;
    }

    public static void setGrades(double[] grades) {
        StaticInitializationBlocks.grades = grades;
    }
}
