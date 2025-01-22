package study.viradonojiraya.generics.domain;

import java.util.Comparator;

public class Boat {
    private String name;

    public Boat(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                '}';
    }
}
