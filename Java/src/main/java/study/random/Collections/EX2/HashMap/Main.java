package study.random.Collections.EX2.TreeMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> names = new TreeMap<>();
        names.put("Homem", List.of("Danilo", "Adelino", "Fernando", "Daniel", "Abel", "Elias"));
        names.put("Trans", List.of("Lohanny", "Emily", "Darlene", "João"));
        names.put("Mulher", List.of("Bruna", "Cássia", "Eliane", "Bárbara"));

        System.out.println(names.keySet());
        System.out.println(names.entrySet());
        System.out.println(names.values());
        System.out.println(names.get("Trans"));

        System.out.println(names);
    }
}
