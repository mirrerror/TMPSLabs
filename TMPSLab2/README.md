# Structural Design Patterns (Laboratory Work #2)

---

## Objectives:
&ensp; &ensp; **1.** Study and understand the Structural Design Patterns.

&ensp; &ensp; **2.** As a continuation of the previous laboratory work, think about the functionalities that your system will need to provide to the user.

&ensp; &ensp; **3.** Implement some additional functionalities using structural design patterns.

---

## Overview

This project demonstrates the use of structural design patterns in Java to enhance the modularity, flexibility, and maintainability of an e-commerce system. The patterns implemented are:

- **Adapter Pattern**: Enables the system to integrate with an incompatible third-party payment gateway.
- **Composite Pattern**: Manages a catalog structure where categories can contain both products and subcategories, treating them uniformly.
- **Facade Pattern**: Provides a simplified interface for adding products to the cart and checking out.

---

## Design Patterns Implemented

### 1. Adapter Pattern

The **Adapter Pattern** bridges the gap between our system’s `PaymentProcessor` interface and a third-party payment gateway with an incompatible `makePayment` method.

#### Key Files
- `PaymentProcessor.java`: Target interface
- `ThirdPartyPaymentGateway.java`: Incompatible interface
- `PaymentAdapter.java`: Adapter to make `ThirdPartyPaymentGateway` compatible with `PaymentProcessor`

### 2. Composite Pattern

The **Composite Pattern** organizes the product catalog, allowing categories to contain products or other subcategories. This enables uniform treatment of items within the catalog structure.

#### Key Files
- `CatalogComponent.java`: Component interface for catalog entries
- `Product.java`: Represents individual products (leaf nodes)
- `Category.java`: Represents categories that may contain products or subcategories (composite nodes)

### 3. Facade Pattern

The **Facade Pattern** simplifies client interaction by providing a unified interface for adding products to the cart and checking out.

#### Key Files
- `Cart.java`: Manages cart items and checkout processes
- `ECommerceFacade.java`: Provides simplified methods for adding items to the cart and initiating checkout

---

## Implementation & Explanation

### 1. Adapter Pattern

**Code Location**: `payments/PaymentProcessor.java`, `payments/ThirdPartyPaymentGateway.java`, `payments/PaymentAdapter.java`

#### Purpose and Usage:
The **Adapter Pattern** was used to integrate a third-party payment gateway that had an incompatible interface with our system’s `PaymentProcessor`. By creating an adapter, we bridged the third-party interface and our system, allowing seamless payment processing in the client code.

#### Code Snippet:
```java
public class PaymentAdapter implements PaymentProcessor {

    private final ThirdPartyPaymentGateway gateway;

    public PaymentAdapter(ThirdPartyPaymentGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        gateway.makePayment(amount);
    }

}
```

---

### 2. Composite Pattern

**Code Location**: `models/CatalogComponent.java`, `models/Product.java`, `models/Category.java`

#### Purpose and Usage:
The **Composite Pattern** was implemented to manage the product catalog, where each category could contain both individual products and subcategories. This allowed us to treat products and categories in a uniform way, enabling recursive traversal through the catalog’s hierarchy.

#### Code Snippet:
```java
public class Product implements CatalogComponent {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showDetails() {
        System.out.println(name + " - " + price + "$");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

public class Category implements CatalogComponent {

    private String name;
    private final List<CatalogComponent> components = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void addComponent(CatalogComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Category: " + name);
        for (CatalogComponent component : components) {
            component.showDetails();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
```

---

### 3. Facade Pattern

**Code Location**: `models/Cart.java`, `models/CartItem.java`, `ecommerce/ECommerceFacade.java`

#### Purpose and Usage:
The **Facade Pattern** simplified interactions with the e-commerce system by centralizing functionalities such as adding products to a cart and checking out. This unified interface allowed the client to perform these actions without managing the complexities of the subsystem components.

#### Code Snippet:
```java
public class ECommerceFacade {

    private final Cart cart = new Cart();

    public void addProductToCart(String productName, int quantity) {
        cart.addItem(productName, quantity);
    }

    public void completeCheckout() {
        cart.checkout();
    }

}
```

## Sample Output

### Adapter Pattern
```
Payment of 50.00$ processed through third-party gateway.
```

### Composite Pattern
```
Category: Electronics
Laptop - 999.99$
Smartphone - 499.99$
```

### Facade Pattern
```
1 x Laptop added to cart.
2 x Smartphone added to cart.
Checkout initiated for 2 items.
```

## Conclusion

This project demonstrates how structural design patterns can make a system more modular and maintainable. By using the **Adapter**, **Composite**, and **Facade** patterns, the e-commerce system becomes flexible and scalable, accommodating changes and new integrations with minimal effort.