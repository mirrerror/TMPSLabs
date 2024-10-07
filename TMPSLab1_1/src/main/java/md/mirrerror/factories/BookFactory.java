package md.mirrerror.factories;

import md.mirrerror.models.Book;

public abstract class BookFactory {
    public abstract Book createBook(String title, String author);
}
