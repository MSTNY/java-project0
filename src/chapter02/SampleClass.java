package chapter02;

public class SampleClass {
    public static void main(String[] args) {
        String a = "HelloJava";
        String[] result = a.split("J");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        System.out.println(a.charAt(6));
    }


}
