package study.viradonojiraya.streams.test;

import study.viradonojiraya.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamsWithoutStreamTest {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Nauto", 29.99),
            new LightNovel("Dragon Ball Z", 19.99),
            new LightNovel("Dragon Ball", 14.99),
            new LightNovel("Berserk", 10.20),
            new LightNovel("One Piece", 11.39),
            new LightNovel("Neon Genesis Evangellion", 30),
            new LightNovel("Bleach", 19.99),
            new LightNovel("Hellsing", 11.39)
    ));

    public static List<String> orderAndRetrieveByTitle(List<LightNovel> lightNovels) {
        lightNovels.sort(new Comparator<LightNovel>() {
            @Override
            public int compare(LightNovel o1, LightNovel o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        List<LightNovel> filteredList = filterList(lightNovels, new Predicate<LightNovel>() {
            @Override
            public boolean test(LightNovel lightNovel) {
                return lightNovel.getPrice() < 15;
            }
        });

        return mapList(filteredList, new Function<LightNovel, String>() {
            @Override
            public String apply(LightNovel lightNovel) {
                return lightNovel.getTitle();
            }
        });
    }

    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T t: list) {
            if (predicate.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }

    public static <T, R> List<R> mapList(List<T> list, Function<T, R> function) {
        List<R> mappedList = new ArrayList<>();
        for (T e: list) {
            R r = function.apply(e);
            mappedList.add(r);
        }
        return mappedList;
    }

    public static void main(String[] args) {
        System.out.println(orderAndRetrieveByTitle(lightNovels));
    }
}
