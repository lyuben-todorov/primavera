package com.lyuben.primavera.domain.product;

import javax.persistence.Entity;

@Entity
public class BaseProduct extends Product {
    public BaseProduct(String name, String brand, int price, int availability, String description) {
        super(name, brand, price, availability, description);
    }

    public BaseProduct(ProductInfo productInfo) {
        super(productInfo);
    }

}
