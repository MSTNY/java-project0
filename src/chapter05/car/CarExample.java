package chapter05.car;

public class CarExample {
    public static void main(String[] args) {
        Car sonata1 = new Car("hyundai", 100);
        sonata1.changeSoftware();
        sonata1.printSpec();
        sonata1.setModel("sonata");

        Car k5 = new Car();
        k5.printSpec();
        k5.setModel("k5");
    }
}
