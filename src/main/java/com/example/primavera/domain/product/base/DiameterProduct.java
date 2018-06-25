package com.example.primavera.domain.product.base;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class DiameterProduct extends BaseProduct {
    private double diameterBottom;
    private double diameterTop;

    public DiameterProduct() {
    }

    public DiameterProduct(double diameterBottom, double diameterTop) {
        this.diameterBottom = diameterBottom;
        this.diameterTop = diameterTop;
    }

    public double getDiameterBottom() {
        return diameterBottom;
    }

    public void setDiameterBottom(double diameterBottom) {
        this.diameterBottom = diameterBottom;
    }

    public double getDiameterTop() {
        return diameterTop;
    }

    public void setDiameterTop(double diameterTop) {
        this.diameterTop = diameterTop;
    }
}
