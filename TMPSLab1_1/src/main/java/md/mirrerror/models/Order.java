package md.mirrerror.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Book> books;
    private String customerName;

    private Order(OrderBuilder builder) {
        this.books = builder.books;
        this.customerName = builder.customerName;
    }

    public static class OrderBuilder {
        private List<Book> books = new ArrayList<>();
        private String customerName;

        public OrderBuilder addBook(Book book) {
            books.add(book);
            return this;
        }

        public OrderBuilder setCustomerName(String name) {
            this.customerName = name;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getCustomerName() {
        return customerName;
    }
}