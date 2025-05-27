package study.random.Collections.EX2.HashSet;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>(List.of("Danilo", "Adelino", "Bruna", "Cássia", "Eliane", "Fernando", "Bárbara", "Daniel", "Abel", "Elias"));
        names.add("Fernando");

        System.out.println(names.contains("Bruna"));

        System.out.println(names);
    }
}
