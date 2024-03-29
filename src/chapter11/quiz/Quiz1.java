package chapter11.quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Quiz1 {
    public static void main(String[] args) {
        Map<Integer, String> fruitsMap = new HashMap<>();

        fruitsMap.put(1, "레드향");
        fruitsMap.put(2, "사과");
        fruitsMap.put(3, "바나나");
        fruitsMap.put(4, "샤인머스켓");

        Set<Integer> keySet = fruitsMap.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            String value = fruitsMap.get(key);
            System.out.println("[Key]:" + key + "[Value]:" + value);
        }
    }
}
