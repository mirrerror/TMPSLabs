package md.mirrerror.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<CartItem> items = new ArrayList<>();

    public void addItem(String productName, int quantity) {
        items.add(new CartItem(productName, quantity));
        System.out.println(quantity + " x " + productName + " added to cart.");
    }

    public void checkout() {
        System.out.println("Checkout initiated for " + items.size() + " items.");
        items.clear();
    }

}
