package study.viradonojiraya.day14;

import study.viradonojiraya.day14.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();

        mangas.add(new Manga(4L, "Naruto", 20.29));
        mangas.add(new Manga(1L, "Berserk", 11.29));
        mangas.add(new Manga(3L, "One Piece", 25.59));
        mangas.add(new Manga(2L, "Dragon Ball", 15.29));


        mangas.

        for (Manga manga: mangas) {
            System.out.println(manga.getName());
        }
    }
}
