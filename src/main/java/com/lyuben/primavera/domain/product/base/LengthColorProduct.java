package com.lyuben.primavera.domain.product.base;

import java.awt.*;

public class LengthColorProduct extends Product {
    private int length;
    private Color color;

    public LengthColorProduct(String name, String brand, int price, int availability, int length, Color color) {
        super(name, brand, price, availability);
        this.length = length;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}
