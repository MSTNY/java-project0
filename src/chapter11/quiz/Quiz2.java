package chapter11.quiz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = Arrays.asList(3, 3, 5, 8, 2, 2);

        // 방법 1
        for (Integer key : list) {
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        // 방법 2
//        for (Integer key : list) {
//            map.put(key, map.getOrDefault(key, 0) + 1);
//        }
        System.out.println(map);
    }
}
