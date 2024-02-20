package DailyQuiz240220;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AscendingSort {
    public int[] solution(int[] array1, int[] array2) {
        // 스트림 X
//        int[] result = new int[array1.length + array2.length];
//
//        for (int i = 0; i < array1.length; i++) {
//            result[i] = array1[i];
//        }
//
//        for (int i = 0; i < array2.length; i++) {
//            result[array1.length + i] = array2[i];
//        }
//
//        for (int i = 0; i < result.length - 1; i++) {
//            for (int j = i + 1; j < result.length; j++) {
//                if (result[i] > result[j]) {
//                    int temp = result[i];
//                    result[i] = result[j];
//                    result[j] = temp;
//                }
//            }
//        }

        // 스트림
        int[] result = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
        return result;
    }

    public static void main(String[] args) {
        AscendingSort ascendingSort = new AscendingSort();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int x : ascendingSort.solution(array, array2)) {
            System.out.print(x + " ");
        }
    }
}
