package chapter11.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // 1. Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        map.put("홍길동", 80);
        map.put("김길동", 85);
        map.put("이길동", 95);
        map.put("박길동", 80);
        map.put("홍길동", 77);
        System.out.println("총 Entry 수: " + map.size());

        // 2. 객체 찾기
        System.out.println("\t홍길동" + map.get("홍길동"));
        System.out.println();

        // 3. 객체를 하나씩 처리 keySet()
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ":" + value);
        }
        System.out.println();

        // 4. 객체 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수: " + map.size());

        // 5. 객체를 하나씩 처리 entrySet
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();;
            System.out.println("\t" + key + ":" + value);
        }
        System.out.println();

        // 6. 모든 Map.Entry 삭제
        map.clear();
        System.out.println("총 Entry 수: " + map.size());
    }
}
