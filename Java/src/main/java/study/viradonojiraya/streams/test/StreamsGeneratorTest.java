package study.viradonojiraya.streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsGeneratorTest {
    public static void main(String[] args) {
//        IntStream.range(1, 100).forEach(System.out::println);
//        Stream.of("Hello", ",", " ", "world", "!").map(String::toUpperCase).forEach(System.out::print);

        try (Stream<String> lines = Files.lines(Paths.get("test.txt"))) {
            List<String> linesModified = lines.map(line -> line + " modified").toList();
            Path path = Path.of("test.txt");

            Files.write(path, linesModified);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
