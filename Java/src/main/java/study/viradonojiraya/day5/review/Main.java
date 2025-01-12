package study.viradonojiraya.day5.review;

public class Main {
    public static void main(String[] args) {
        College.setSpecialities(new String[]{"Statistics"});
        College college = new College("UFRJ");

        Person person = new Person("Danilo", 28);
        Person student = new Student("Cássia", 27, college);

        person.presentation();
        student.presentation();
    }
}
