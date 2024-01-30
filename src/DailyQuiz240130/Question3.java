package DailyQuiz240130;

public class Question3 {
    public static void main(String args[]) {
        // 0부터 20까지 짝수만 출력하는 코드를 작성해보세요.
        int i = 0;
        while (i < 21) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
