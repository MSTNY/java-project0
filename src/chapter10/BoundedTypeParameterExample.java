package chapter10;

import static chapter10.Util.*;

public class BoundedTypeParameterExample {
    public static void main(String[] args) {
//        String value = compare("a", "b");

        int result1 = compare(1, 2);
        System.out.println(result1);

        int result2 = compare(4.5, 3);
        System.out.println(result2);
    }
}
