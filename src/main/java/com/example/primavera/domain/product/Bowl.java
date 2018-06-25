package com.example.primavera.domain.product;


import com.example.primavera.domain.product.base.DiameterProduct;

import javax.persistence.Entity;

@Entity
public class Bowl extends DiameterProduct {
    private double height;
    private double volume;
    private double depth;


    public Bowl(double diameterBottom, double diameterTop, double height, double volume) {
        super(diameterBottom, diameterTop);
        this.height = height;
        this.volume = volume;
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
