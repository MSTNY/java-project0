package special.exception;

public class MultiException {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[10] = 30 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 배열의 크기를 벗어났습니다." + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다." + e.getMessage());
        }
    }
}
