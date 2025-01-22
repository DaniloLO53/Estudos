package study.viradonojiraya._legacy.days.day16;

import study.viradonojiraya._legacy.days.day16.domain.Consumer;
import study.viradonojiraya._legacy.days.day16.domain.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Danilo");
        Consumer consumer2 = new Consumer("Cássia");

        Manga manga1 = new Manga(1, "Naruto", 10.20);
        Manga manga2 = new Manga(2, "Berserk", 11.20);
        Manga manga3 = new Manga(3, "One Piece", 20.20);
        Manga manga4 = new Manga(4, "Dragon Ball", 15.20);
        Manga manga5 = new Manga(5, "Evangellion", 12.20);

        List<Manga> consumer1List = new ArrayList<>();
        consumer1List.add(manga1);
        consumer1List.add(manga2);

        List<Manga> consumer2List = List.of(manga3, manga4, manga5);

        Map<Consumer, List<Manga>> consumerToManga = new HashMap<>();
        consumerToManga.put(consumer1, consumer1List);
        consumerToManga.put(consumer2, consumer2List);


        for (Map.Entry<Consumer, List<Manga>> entry: consumerToManga.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " + entry.getValue());
        }

    }
}
