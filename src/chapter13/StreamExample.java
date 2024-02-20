package chapter13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(1, 10 , 4, 5, 1, 2);
        Stream<Integer> integerStream = list2.stream();
        integerStream
                .distinct().forEach(System.out::println);
    }
}
