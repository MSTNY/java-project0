package chapter07.inherit;

public class InheritPrinter {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.speed = 0;
        motorcycle.stop = true;
        motorcycle.print();

        Vehicle vehicle = new Motorcycle();
    }
}
