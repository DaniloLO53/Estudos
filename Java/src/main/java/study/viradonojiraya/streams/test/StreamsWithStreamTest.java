package study.viradonojiraya.streams.test;

import study.viradonojiraya.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsWithStreamTest {
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
        return lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(obj -> obj.getPrice() < 15)
                .map(LightNovel::getTitle)
                .toList();
    }
}

















































