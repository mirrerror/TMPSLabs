package md.mirrerror;

import md.mirrerror.factories.BookFactory;
import md.mirrerror.factories.FictionBookFactory;
import md.mirrerror.managers.ConfigManager;
import md.mirrerror.models.Book;
import md.mirrerror.models.Order;

public class Main {
    public static void main(String[] args) {
        // Using Singleton
        ConfigManager config = ConfigManager.getInstance();
        System.out.println(config.getConfig("someKey"));

        // Using Factory Method
        BookFactory fictionFactory = new FictionBookFactory();
        Book book1 = fictionFactory.createBook("1984", "George Orwell");

        // Using Builder
        Order order = new Order.OrderBuilder()
                .addBook(book1)
                .setCustomerName("John")
                .build();

        System.out.println("Order created for " + order.getCustomerName());
    }
}