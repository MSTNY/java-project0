package DailyQuiz240129;

public class Question2 {
    public static void main(String args[]) {
        // 아래 코드의 출력값은 무엇일까요?
        System.out.println(10 / 2 + 3 * 4);     // 17

        // 아래 코드의 출력값은 무엇일까요?
        int number = 10;

        int result1 = number + 1;
        int result2 = number++;
        int result3 = number;
        int result4 = --number;

        System.out.println(result1);            // 11
        System.out.println(result2);            // 10
        System.out.println(result3);            // 11
        System.out.println(result4);            // 10

        // 아래 코드의 출력값은 무엇일까요?
        int num1 = 5;
        int num2 = 7;

        System.out.println((num1 > 5) && (num2 > 5));       // false
        System.out.println((num1 > 5) || (num2 > 5));       // true
        System.out.println(!((num1 > 5) && (num2 > 5)));    // true
    }
}
