package com.lyuben.primavera.domain.product;

import com.lyuben.primavera.domain.product.base.DoubleDiameterProduct;

import javax.persistence.Entity;

@Entity
public class Crown extends DoubleDiameterProduct {

    public Crown(String name, String brand, int price, int availability, double diameterTop, double diameterBottom) {
        super(name, brand, price, availability, diameterTop, diameterBottom);
    }


    @Override
    public String toString() {
        return "Crown{" +
                "diameterAbove=" + getDiameterTop() +
                ", diameterBelow=" + getDiameterBottom() +
                '}';
    }
}
