package study.random.Collections.EX2.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Danilo", "Adelino", "Bruna", "Cássia", "Eliane", "Fernando", "Bárbara", "Daniel", "Abel", "Elias"));

        names.add(2, "Bernardo");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().toLowerCase().startsWith("a")) {
                iterator.remove();
            }
        }

        System.out.println(names);
    }
}
