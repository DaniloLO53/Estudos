package study.viradonojiraya._legacy.days.day3.test;

import study.viradonojiraya._legacy.days.day3.domain.Student;

public class OOP {
    public static void setStudent(Student student, String name, int age, char gender) {
        student.name = name;
        student.age = age;
        student.gender = gender;
    }

    public static double averageAge(double... ages) {
        double agesSum = 0;
        for(double age: ages) {
            agesSum += age;
        }

        return agesSum / ages.length;
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        setStudent(student1, "Danilo", 28, 'M');
        setStudent(student2, "Cássia", 27, 'F');
        setStudent(student3, "Eliane", 56, 'F');
        setStudent(student4, "Adelino", 72, 'M');

        double[] ages;
        ages = new double[]{student1.age, student2.age, student3.age, student4.age};

        System.out.println(averageAge(ages));
    }
}
