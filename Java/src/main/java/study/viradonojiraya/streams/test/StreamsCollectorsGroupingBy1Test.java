package study.viradonojiraya.streams.test;

import study.viradonojiraya.streams.domain.Category;
import study.viradonojiraya.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsCollectorsGroupingBy1Test {
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
        System.out.println(mapWithoutStreams(lightNovels));
        System.out.println(mapWithStreams(lightNovels));

    }

    public static Map<Category, List<LightNovel>> mapWithStreams(List<LightNovel> list) {
        return list.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
    }

    public static Map<Category, List<LightNovel>> mapWithoutStreams(List<LightNovel> list) {
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();

        List<LightNovel> actionLightNovels = new ArrayList<>();
        List<LightNovel> horrorLightNovels = new ArrayList<>();
        List<LightNovel> romanceLightNovels = new ArrayList<>();

        for (LightNovel ln: list) {
            switch (ln.getCategory()) {
                case ACTION:
                    actionLightNovels.add(ln);
                    break;
                case HORROR:
                    horrorLightNovels.add(ln);
                    break;
                case ROMANCE:
                    romanceLightNovels.add(ln);
                    break;
                default:
                    break;
            }
        }

        categoryLightNovelMap.put(Category.ACTION, actionLightNovels);
        categoryLightNovelMap.put(Category.ROMANCE, romanceLightNovels);
        categoryLightNovelMap.put(Category.HORROR, horrorLightNovels);

        return categoryLightNovelMap;
    }
}
