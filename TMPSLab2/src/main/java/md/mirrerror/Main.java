package md.mirrerror;

import md.mirrerror.ecommerce.ECommerceFacade;
import md.mirrerror.models.Category;
import md.mirrerror.models.Product;
import md.mirrerror.payments.PaymentAdapter;
import md.mirrerror.payments.PaymentProcessor;
import md.mirrerror.payments.ThirdPartyPaymentGateway;

public class Main {

    public static void main(String[] args) {
        // Adapter pattern
        PaymentProcessor payment = new PaymentAdapter(new ThirdPartyPaymentGateway());
        payment.processPayment(50.00);

        // Composite pattern
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.99);

        Category electronics = new Category("Electronics");
        electronics.addComponent(product1);
        electronics.addComponent(product2);

        electronics.showDetails();

        // Facade pattern
        ECommerceFacade ecommerce = new ECommerceFacade();
        ecommerce.addProductToCart("Laptop", 1);
        ecommerce.addProductToCart("Smartphone", 2);
        ecommerce.completeCheckout();
    }

}
