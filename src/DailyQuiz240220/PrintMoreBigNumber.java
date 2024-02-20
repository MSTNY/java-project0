package DailyQuiz240220;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintMoreBigNumber {
    public List<Integer> solution(int n, int[] array) {

        // 스트림 X
//        List<Integer> answer = new ArrayList<>();
//        for (int element : array) {
//            if (element >= n) {
//                answer.add(element);
//            }
//        }

        // 스트림
        List<Integer> answer = Arrays.stream(array).filter(x -> x >= n).boxed().toList();

        return answer;
    }

    public static void main(String[] args) {
        PrintMoreBigNumber printMoreBigNumber = new PrintMoreBigNumber();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        for (int x : printMoreBigNumber.solution(number, array)) {
            System.out.print(x + " ");
        }
    }
}
