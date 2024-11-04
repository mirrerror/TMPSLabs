package md.mirrerror.models;

import java.util.ArrayList;
import java.util.List;

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
