package study.viradonojiraya.streams.test;

import study.viradonojiraya.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamsReduceTest {
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

    public static void main(String[] args) {
        double defaultPrice = 30;

        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > defaultPrice)
                .reduce(Double::sum)
                .ifPresentOrElse(System.out::println, () -> System.out.println("EMPTY"));

        System.out.println(lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > defaultPrice)
                .reduce(Double::sum)
                .get());

        System.out.println(lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > defaultPrice)
                .sum());
    }
}
