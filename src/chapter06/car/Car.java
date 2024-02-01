package chapter06.car;


public class Car {
    final int version = 1;
    boolean stop;
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

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public String getModel() {
        return version + "." + model;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
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
