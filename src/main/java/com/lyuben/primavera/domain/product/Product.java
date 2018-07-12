package com.lyuben.primavera.domain.product;

import javax.persistence.*;


@MappedSuperclass
@DiscriminatorColumn(name = "DISCRIMINATOR", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("USER")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String brand;
    private int price;
    private int availability;
    private String description;

    public Product() {
    }

    public Product(String name, String brand, int price, int availability, String description) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.availability = availability;
        this.description = description;
    }


    public Product(ProductInfo productInfo) {
        this.name = productInfo.getName();
        this.brand = productInfo.getBrand();
        this.price = productInfo.getPrice();
        this.availability = productInfo.getAvailability();
        this.description = productInfo.getDescription();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return availability > 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
}
