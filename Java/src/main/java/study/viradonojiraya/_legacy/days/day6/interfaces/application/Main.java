package study.viradonojiraya._legacy.days.day6.interfaces.application;

import study.viradonojiraya._legacy.days.day6.interfaces.domain.DatabaseLoader;
import study.viradonojiraya._legacy.days.day6.interfaces.domain.FileLoader;

public class Main {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
    }
}
