package DailyQuiz240214.question4;

public class Util {
    public static <K, V> V getValue(Pair<K, V> pair, K key) {
        if (pair.getKey() == key) {
            return pair.getValue();
        } else {
            return null;
        }
    }
}
