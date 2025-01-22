package study.viradonojiraya._legacy.days.day6.interfaces.domain;

import study.viradonojiraya._legacy.days.day6.interfaces.domain.interfaces.DataLoader;
import study.viradonojiraya._legacy.days.day6.interfaces.domain.interfaces.DataRemover;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading files...");
    }

    @Override
    public void remove() {
        System.out.println("Removing file...");
    }
}
