package chapter05.car;

public class Car {
    String company;
    int speed = 100;
    String sw = "samsung";
    Seat seat;
    String model;

    public Car() {
        company = "hyundai";
        speed = 200;
        seat = new Seat("default");
    }
    public Car(String company, int speed) {
        this.company = company;
        this.speed = speed;
        seat = new Seat("cool");
    }

    void setModel(String model) {
        this.model = model;
    }
    void changeSoftware() {
        sw = "lg";
    }

    int getSpeed() {
        return speed;
    }
    void printSpec() {
        String spec = String.format("company : %s speed : %s sw : %s seat : %s", company, speed, sw, seat.type);
        System.out.println(spec);
    }
}
