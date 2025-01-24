package study.viradonojiraya.streams.test;

import study.viradonojiraya.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsCollectorsSummarizingTest {
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
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        System.out.println(lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice)));

        System.out.println(lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", ")));
    }
}
