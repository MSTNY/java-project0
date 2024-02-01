package chapter07.inherit;

public class Vehicle {
    String model;
    int speed;
    boolean stop;
    String color;
    int wheelCount;
    boolean onOff;

    public Vehicle() {
        model = "Tesla modelX";
        speed = 300;
        stop = true;
    }

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void print() {
        System.out.println("Parent: " + model + "," + speed + ","+ stop);
    }
}
