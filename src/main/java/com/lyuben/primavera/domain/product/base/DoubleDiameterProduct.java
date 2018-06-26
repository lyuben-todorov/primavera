package com.lyuben.primavera.domain.product.base;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class DoubleDiameterProduct extends Product {
    private double diameterBottom;
    private double diameterTop;

    public DoubleDiameterProduct(String name, String brand, int price, int availability, double diameterTop, double diameterBottom) {
        super(name, brand, price, availability);
        this.diameterTop = diameterTop;
        this.diameterBottom = diameterBottom;
    }

    protected double getDiameterBottom() {
        return diameterBottom;
    }

    public void setDiameterBottom(double diameterBottom) {
        this.diameterBottom = diameterBottom;
    }

    protected double getDiameterTop() {
        return diameterTop;
    }

    public void setDiameterTop(double diameterTop) {
        this.diameterTop = diameterTop;
    }
}
