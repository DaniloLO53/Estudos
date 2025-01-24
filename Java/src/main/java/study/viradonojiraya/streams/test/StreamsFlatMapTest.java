package study.viradonojiraya.streams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamsFlatMapTest {
    static List<List<String>> team = new ArrayList<>();

    static List<String> developers = List.of("Danilo", "Camila");
    static List<String> marketing = List.of("Cássia", "Claudete");
    static List<String> manage = List.of("Eliane", "Cláudio", "Adelino");

    public static void main(String[] args) {
        team.add(developers);
        team.add(marketing);
        team.add(manage);

//        team.stream().flatMap(group -> group.stream().sorted()).forEach(System.out::println);
//        team.stream().flatMap(group -> group.stream()).forEach(System.out::println);
//        team.stream().map(group -> group.getFirst()).forEach(name -> System.out.println(name));
        team.stream().flatMap(Collection::stream).map(name -> name.split("")).flatMap(Arrays::stream).forEach(System.out::printf);
    }
}
