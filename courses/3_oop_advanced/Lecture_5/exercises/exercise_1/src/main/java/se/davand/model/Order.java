package se.davand.model;

import java.util.List;

public class Order {
    private Long id;
    private List<OrderItem> items;

    public Order(Long id, List<OrderItem> items) {
        this.id = id;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
}
