package DailyQuiz240201;

public class ItemManager {
    public static void main(String[] args) {
        Album album = new Album(1, "album_1", 5000, "artist_1");
        Movie movie = new Movie(1, "movie_1", 6000, "director_1", "actor_1");
        Book book = new Book(1, "book_1", 7000, "author_1", "000-000-000-000");

        album.print();
        movie.print();

    }
}
