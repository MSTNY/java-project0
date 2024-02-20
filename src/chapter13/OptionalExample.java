package chapter13;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> nullableOpt = Optional.ofNullable(null);
        Optional<String> nullableOpt2 = Optional.ofNullable("str");
        System.out.println(nullableOpt2.orElse("default"));

        
    }
}
