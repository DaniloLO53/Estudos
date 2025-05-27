package study.random.Collections.EX2.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>(List.of("Danilo", "Adelino", "Bruna", "Cássia", "Eliane", "Fernando", "Bárbara", "Daniel", "Abel", "Elias"));

        names.addFirst("Bernardo");
        names.addLast("Camila");

        names.pop();

        System.out.println(names);
    }
}
