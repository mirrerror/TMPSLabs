# Structural Design Patterns (Laboratory Work #3)

---

## Objectives:
&ensp; &ensp; **1.** Study and understand the Behavioral Design Patterns.

&ensp; &ensp; **2.** As a continuation of the previous laboratory work, think about what communication between software entities might be involed in your system.

&ensp; &ensp; **3.** Implement some additional functionalities using behavioral design patterns.

---

## Overview

This project demonstrates the use of structural design patterns in Java to enhance the modularity, flexibility, and maintainability of an e-commerce system. The patterns implemented are:

- **Adapter Pattern**: Enables the system to integrate with an incompatible third-party payment gateway.
- **Composite Pattern**: Manages a catalog structure where categories can contain both products and subcategories, treating them uniformly.
- **Facade Pattern**: Provides a simplified interface for adding products to the cart and checking out.

---

## Design Patterns Implemented

### 1. Observer Pattern

The **Observer Pattern** was implemented to notify the email and SMS subscribers when the news agency posts something new.

#### Key Files
- `Observer.java`: Interface for observers
- `Subject.java`: Class for subjects to be observed
- `EmailObserver.java`: Concrete observer that receives email notifications
- `SMSObserver.java`: Concrete observer that receives SMS notifications

---

## Implementation & Explanation

### 1. Observer Pattern

#### Purpose and Usage:
The **Observer Pattern** was implemented to notify the email and SMS subscribers when the news agency posts something new.

#### Code Snippet:
```java
public interface Observer {
    void update(String message);
}

public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String state;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
```

---

## Sample Output




## Conclusion

