package study.viradonojiraya.streams.test;

import study.viradonojiraya.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class StreamsTest1 {
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
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));

        return mapList(lightNovels, LightNovel::getTitle);
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
