package chapter11.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("첫번째");
        list.add("두번째");
        list.add("두번째");

        String element1 = list.get(0);
        boolean doContain = list.contains("첫번째");
        System.out.println(element1);
        System.out.println(doContain);

        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.clear();
        System.out.println(list);

        list = null;
        if (list == null || list.isEmpty()) {
            System.out.println("list is empty");
        }
    }
}
