package chapter08.polymorphism;

public class Sample {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Predator lion = new Lion();
        zooKeeper.feed(lion);

        Predator tiger = new Tiger();
        zooKeeper.feed(tiger);
    }
}


class Tiger implements Predator {
    @Override
    public void feed() {
        System.out.println("feed meat");
    }
}

class Lion implements Predator {

    @Override
    public void feed() {
        System.out.println("feed fish");
    }
}

class ZooKeeper {
    void feed(Predator predator) {
        predator.feed();
    }
}