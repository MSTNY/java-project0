package chapter10;

import static chapter10.Util.*;

public class GenericMethodExample {
    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();

        Box<String> box2 = boxing("홍길동");
        String strValue = box2.get();

        System.out.println(intValue + "" + strValue);
    }
}
