package chapter13;

import java.util.Arrays;
import java.util.List;

public class FlatmapExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello World", "Java stream", "HiStream"  );
        list.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .forEach(System.out::println);

        List<Integer> list2 = Arrays.asList(15, 6, 7, 8, 2, 1);
        list2.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
