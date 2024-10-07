package md.mirrerror.factories;

import md.mirrerror.models.Book;

public class NonFictionBookFactory extends BookFactory {
    @Override
    public Book createBook(String title, String author) {
        return new Book(title, author, "Non-Fiction");
    }
}
