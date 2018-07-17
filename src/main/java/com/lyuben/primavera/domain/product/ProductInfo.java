package com.lyuben.primavera.domain.product;

import com.lyuben.primavera.domain.Category;

public class ProductInfo {
    private String name;
    private String brand;
    private int price;
    private int availability;
    private String description;
    private Category category;

    public ProductInfo(String name, String brand, int price, int availability, String description, Category category) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.availability = availability;
        this.description = description;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getAvailability() {
        return availability;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }
}
