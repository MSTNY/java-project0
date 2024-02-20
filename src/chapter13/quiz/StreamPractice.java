package chapter13.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);
        List<String> stringList = integerList.stream()
                .distinct()
                .map(String::valueOf)
                .toList();

        List<Member> memberList = Arrays.asList(
                new Member("kim", "purple", 20),
                new Member("lee", "yellow", 22),
                new Member("park", "red", 24)
        );
        List<Person> personList = memberList.stream()
                .map(member -> new Person(member.getName(), member.getAge()))
                .toList();
        personList.forEach(person -> System.out.println(person.getName() + " " + person.getAge()));
    }
}
