package study.random.Collections.EX2.TreeSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>(List.of("Danilo", "Adelino", "Bruna", "Cássia", "Eliane", "Fernando", "Bárbara", "Daniel", "Abel", "Elias"));
        names.add("Fernando");

        System.out.println(names);
    }
}
