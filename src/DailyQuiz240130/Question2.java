package DailyQuiz240130;

public class Question2 {
    public static void main(String args[]) {
        // for문을 이용하여 배열에 있는 숫자들의 최대값과 평균을 구하세요.
        int[] array = {12, 4, 7, 20, 1};

        // 최대값
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                i++;
            }
        }
        // 평균
        double sum = 0;
        for (int number : array) {
            sum += number;
        }
        double avg = sum / array.length;



        // 결과 출력 (최대값: max, 평균: avg)
        System.out.println(max);
        System.out.println(avg);
    }
}
