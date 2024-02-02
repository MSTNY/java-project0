package DailyQuiz240201;

public class Movie extends  Item {
    String director;
    String actor;

    Movie(int id, String name, int price, String director, String actor) {
        super(id, name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %d, %s, %s",id, name, price, director, actor);
    }

}
