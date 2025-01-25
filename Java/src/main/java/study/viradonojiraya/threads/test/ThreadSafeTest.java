package study.viradonojiraya.threads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames {
    private final List<String> names = new ArrayList<>();

    public synchronized void add(String name) {
        names.add(name);
        System.out.println(names);;
    }

    public synchronized void removeFirst() {
        if (!names.isEmpty()) {
            System.out.println(Thread.currentThread().getName());
            names.removeFirst();
        }

        System.out.println(names);
    }
}

public class ThreadSafeTest {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();

        threadSafeNames.add("Danilo");

        Runnable r = threadSafeNames::removeFirst;

        new Thread(r).start();
        new Thread(r).start();
    }
}
