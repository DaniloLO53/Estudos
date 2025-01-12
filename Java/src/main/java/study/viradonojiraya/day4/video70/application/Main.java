package study.viradonojiraya.day4.video70.application;

import study.viradonojiraya.day4.video70.domain.Place;
import study.viradonojiraya.day4.video70.domain.Seminar;
import study.viradonojiraya.day4.video70.domain.Student;
import study.viradonojiraya.day4.video70.domain.Teacher;

public class Main {
    public static void main(String[] args) {
        Place place = new Place("UFRJ");

        Teacher teacher1 = new Teacher("Palma", "Banco de Dados");
        Teacher teacher2 = new Teacher("Flávio", "Computação");

        Student student1 = new Student("Danilo", 28);
        Student student2 = new Student("Cássia", 27);
        Student student3 = new Student("Alan", 22);

        Seminar seminar1 = new Seminar("Banco de Dados", place);
        Seminar seminar2 = new Seminar("I.A", place);
        Seminar seminar3 = new Seminar("Automata", place);
    }
}
