package study.viradonojiraya.generics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod1 {
    public static void main(String[] args) {

    }

    private static <T> void createArrayWithObject(T t) {
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }
}
