package com.lyuben.primavera.domain.product;

import com.lyuben.primavera.domain.product.base.LengthColorProduct;

import javax.persistence.Entity;
import java.awt.*;

@Entity
public class Hose extends LengthColorProduct {
    public Hose(String name, String brand, int price, int availability, int length, Color color) {
        super(name, brand, price, availability, length, color);
    }
}
