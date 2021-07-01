package ru.geekbrains.market;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private int id;
    private String title;
    private long cost;

    public Product() {
    }

    public Product(int id, String title, long cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public long getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCost(long cost) {
        this.cost = cost;
    }
}
