package study.viradonojiraya._legacy.days.day3.domain;

public class InitializationBlocks {
    private String name;
    private double[] grades;

    // Initialization block: executed before constructors
    // It can initiate something common to all constructors
    // It avoids the need to replicate some code inside all the constructors
    {
        System.out.println("Inside initialization block");
        grades = new double[100];
        for (int index = 0; index < grades.length; index++) {
            grades[index] = index + 1;
            System.out.println("Grade: " + grades[index]);
        }
    }

    public InitializationBlocks(String name) {
        this.name = name;
    }

    public InitializationBlocks() {
        System.out.println("Inside constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }
}
