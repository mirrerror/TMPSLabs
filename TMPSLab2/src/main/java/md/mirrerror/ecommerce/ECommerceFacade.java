package md.mirrerror.ecommerce;

import md.mirrerror.models.Cart;

public class ECommerceFacade {

    private final Cart cart = new Cart();

    public void addProductToCart(String productName, int quantity) {
        cart.addItem(productName, quantity);
    }

    public void completeCheckout() {
        cart.checkout();
    }

}
