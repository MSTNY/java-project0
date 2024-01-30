package chapter04;

public class IterationSample {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i : arr) {
            System.out.println(i);
        }



        int[] marks = {90, 25, 67, 45, 80};

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 50) {
                continue;
            }
            System.out.println((i + 1) + "번 학생, 축하합니다 합격입니다!");
        }
        
        
        //2단 ~ 9단
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }


        // while문을 사용해서 1 ~ 10 홀수만 출력해주세요
        int number = 0;
        while (number < 10) {
            number++;
            if(number % 2 == 0) {
                continue;
            }
            System.out.println(number);
        }


        //do-while문 사용해서 10 이하의 짝수를 출력해주세요
        int index = 0;
        do {
            index++;
            if (index % 2 == 0) {
                System.out.println(index);
            }
        } while (index < 11);
    }
}
