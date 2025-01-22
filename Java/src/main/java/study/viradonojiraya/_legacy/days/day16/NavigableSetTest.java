package study.viradonojiraya._legacy.days.day16;

import study.viradonojiraya._legacy.days.day16.domain.Manga;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class MangaNameComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class NavigableSetTest {
    public static void main(String[] args) {
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaNameComparator());
        Manga manga1 = new Manga(1, "Naruto", 22.20);
        mangas.add(manga1);

        System.out.println(mangas);
    }

}
