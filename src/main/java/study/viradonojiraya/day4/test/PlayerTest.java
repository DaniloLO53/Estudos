package study.viradonojiraya.day4.test;

import study.viradonojiraya.day4.domain.Player;
import study.viradonojiraya.day4.domain.Teacher;
import study.viradonojiraya.day4.domain.Team;

public class PlayerTest {
    public static void main(String[] args) {
        Team team1 = new Team("Flamengo");

        Teacher teacher1 = new Teacher("Eduardo");
        Teacher teacher2 = new Teacher("Mônica");
        Teacher teacher3 = new Teacher("Bernardo");

        Team team2 = new Team("Fluminense", new Teacher[]{ teacher2, teacher3 });

        team1.setTeachers(new Teacher[]{ teacher1, teacher2});
        team1.presentation();
        team2.presentation();

    }
}
