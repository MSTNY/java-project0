package DailyQuiz240201;

public class Album extends Item {
    String artist;

    Album(int id, String name, int price, String artist) {
        super(id, name, price);
        this.artist = artist;
    }
}
