package chapter07.inherit;

public class Car extends Vehicle{

   Car(String model, int speed, boolean stop) {
       super(model, speed);
       this.stop = stop;
   }

    public void print() {
        System.out.println("Child(Car): " + model + "," + speed + "," + stop);
    }

}
