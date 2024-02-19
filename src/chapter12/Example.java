package chapter12;

import javax.imageio.ImageTranscoder;
import java.util.function.*;

public class Example {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("출력문 테스트");
            }
        };
        r1.run();

        Supplier<String> s = () -> "리턴값";
        System.out.println(s.get());

        Consumer<Integer> c = x -> System.out.println(x);
        c.accept(3);

        DoubleConsumer d = x -> System.out.println(x);
        d.accept(2.54);

        Function<String, Integer> f = y -> Integer.parseInt(y);
        f.apply("1234");

        Function<Integer, String> f2 = a -> String.valueOf(a);

        Predicate<Integer> p = a -> {
            boolean is = false;

            is = a % 2 == 0;

            return is;
        };
        p.test(10);

        LongSupplier ls = () -> 123456789L;
        System.out.println(ls.getAsLong());
    }
}
