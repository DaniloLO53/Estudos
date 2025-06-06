package study.viradonojiraya.streams.test;

import study.viradonojiraya.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsFindingAndMatchingTest {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 29.99),
            new LightNovel("Dragon Ball Z", 19.99),
            new LightNovel("Dragon Ball", 14.99),
            new LightNovel("Berserk", 10.20),
            new LightNovel("One Piece", 11.39),
            new LightNovel("Neon Genesis Evangellion", 30),
            new LightNovel("Bleach", 19.99),
            new LightNovel("Hellsing", 11.39)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 10));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 15)
                .min(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
