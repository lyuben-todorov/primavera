package com.lyuben.primavera.domain.product;


import com.lyuben.primavera.domain.product.base.DoubleDiameterProduct;

import javax.persistence.Entity;

@Entity
public class Bowl extends DoubleDiameterProduct {
    private double height;
    private double depth;
    private double volume;

    public Bowl(String name, String brand, int price, int availability, double diameterTop, double diameterBottom, double height, double depth, double volume) {
        super(name, brand, price, availability, diameterTop, diameterBottom);
        this.height = height;
        this.depth = depth;
        this.volume = volume;
    }

    public Bowl(String name, String brand, int price, int availability, double diameterTop, double diameterBottom, double height, double depth) {
        super(name, brand, price, availability, diameterTop, diameterBottom);
        this.height = height;
        this.depth = depth;
        setVolume();
    }

    private void setVolume() {
        this.volume = 3.14 * depth * getDiameterTop() * getDiameterTop() / 4;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
