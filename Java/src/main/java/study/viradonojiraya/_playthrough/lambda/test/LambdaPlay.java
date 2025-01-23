package study.viradonojiraya._playthrough.lambda.test;

import study.viradonojiraya._playthrough.lambda.domain.Ninja;
import study.viradonojiraya._playthrough.lambda.enums.Village;
import study.viradonojiraya._playthrough.lambda.service.FighterSelector;

import java.util.ArrayList;
import java.util.List;

public class LambdaPlay {
    private static List<Ninja> ninjas = new ArrayList<>(List.of(
            new Ninja("Naruto", 16, Village.LEAF, 10_000, 8_000),
            new Ninja("Sasuke", 16, Village.LEAF, 10_500, 7_000),
            new Ninja("Killer Bee", 16, Village.WIND, 8_000, 6_000),
            new Ninja("Jiraya", 16, Village.LEAF, 8_500, 7_500),
            new Ninja("Dosu", 16, Village.SOUND, 3_000, 2_000),
            new Ninja("Orochimaru", 16, Village.LEAF, 8_000, 9_000),
            new Ninja("Sarutobi", 16, Village.LEAF, 7_000, 7_000),
            new Ninja("Gaara", 16, Village.FIRE, 7_000, 7_500)
    ));

    public static void main(String[] args) {
        System.out.println(FighterSelector.sortNinjaByNameAndRetrieveAttackOverN(ninjas, 8500));
    }
}
