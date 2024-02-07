package chapter09;

public class Executor {
    public static void main(String[] args) throws Exception {
        try {
            exceptionTest();
            exceptionTest2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void exceptionTest() throws RunXXXException {
        throw new RunXXXException("런타임 예외 던지기");
    }

    public static void exceptionTest2() throws XXXException {
        throw new XXXException("checked 예외 던지기");
    }
}
