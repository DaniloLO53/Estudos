package study.viradonojiraya.streams.test;

import study.viradonojiraya.streams.domain.Category;
import study.viradonojiraya.streams.domain.LightNovel;
import study.viradonojiraya.streams.domain.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsCollectorsGroupingBy2Test {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Nauto", 29.99, Category.ROMANCE),
            new LightNovel("Dragon Ball Z", 19.99, Category.ACTION),
            new LightNovel("Dragon Ball", 14.99, Category.ROMANCE),
            new LightNovel("Berserk", 10.20, Category.HORROR),
            new LightNovel("One Piece", 11.39, Category.ACTION),
            new LightNovel("Neon Genesis Evangellion", 30, Category.ROMANCE),
            new LightNovel("Bleach", 19.99, Category.ACTION),
            new LightNovel("Hellsing", 11.39, Category.HORROR)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> {
                    return ln.getPrice() < 10 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
                })));

        System.out.println(lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting())));
    }


}
