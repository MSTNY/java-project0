package DailyQuiz240201;

public class Item {
    int id;
    String name;
    int price;

    Item(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %d",id, name, price);
    }

    void print() {
        System.out.println(this.toString());
    }
}
