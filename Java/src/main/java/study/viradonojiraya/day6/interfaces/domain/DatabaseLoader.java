package study.viradonojiraya.day6.interfaces.domain;

import study.viradonojiraya.day6.interfaces.domain.interfaces.DataLoader;
import study.viradonojiraya.day6.interfaces.domain.interfaces.DataRemover;

// Unlike extending classes, we can implement multiples interfaces
public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading data...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data...");
    }
}
