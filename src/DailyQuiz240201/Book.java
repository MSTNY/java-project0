package DailyQuiz240201;

public class Book extends Item {
    String author;
    String isbn;

    Book(int id, String name, int price, String author, String isbn) {
        super(id, name, price);
        this.author = author;
        this.isbn = isbn;
    }
}
