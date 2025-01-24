package study.viradonojiraya._playthrough.lambda.service;

import study.viradonojiraya._playthrough.lambda.domain.Character;
import study.viradonojiraya._playthrough.lambda.domain.Ninja;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FighterSelector {
    public static List<String> sortNinjaByNameAndRetrieveAttackOverN(List<Ninja> list, int attack) {
        list.sort(new Comparator<Ninja>() {
            @Override
            public int compare(Ninja o1, Ninja o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        List<Ninja> filteredList = filterList(list, new Predicate<Ninja>() {
            @Override
            public boolean test(Ninja ninja) {
                return ninja.getAttack() > attack;
            }
        });

        return mapList(filteredList, new Function<Ninja, String>() {
            @Override
            public String apply(Ninja ninja) {
                return ninja.getName();
            }
        });
    }

    public static List<String> sortNinjaByNameAndRetrieveAttackOverNLambda(List<Ninja> list, int attack) {
        list.sort(new Comparator<Ninja>() {
            @Override
            public int compare(Ninja o1, Ninja o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        list.sort(Comparator.comparing(ninja -> ninja.getName()));
        list.sort(Comparator.comparing(Character::getName));

        List<Ninja> filteredList = filterList(list, ninja -> ninja.getAttack() > attack);

        return mapList(filteredList, Character::getName);
    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();

        for (T t: list) {
            if (predicate.test(t)) {
                filteredList.add(t);
            };
        }

        return filteredList;
    }

    private static <T, R> List<R> mapList(List<T> list, Function<T, R> function) {
        List<R> mappedList = new ArrayList<>();

        for (T e: list) {
            R r = function.apply(e);
            mappedList.add(r);
        }
        return mappedList;
    }

}
