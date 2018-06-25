package com.example.primavera.domain.product;

import com.example.primavera.domain.product.base.BaseProduct;

import javax.persistence.Entity;

@Entity
public class Crown extends BaseProduct {
    private double diameterAbove;
    private double diameterBelow;


    public Crown() {
    }

    public Crown(double diameterAbove, double diameterBelow) {

        this.diameterAbove = diameterAbove;
        this.diameterBelow = diameterBelow;
    }

    public double getDiameterAbove() {
        return diameterAbove;
    }

    public void setDiameterAbove(double diameterAbove) {
        this.diameterAbove = diameterAbove;
    }

    public double getDiameterBelow() {
        return diameterBelow;
    }

    public void setDiameterBelow(double diameterBelow) {
        this.diameterBelow = diameterBelow;
    }

    @Override
    public String toString() {
        return "Crown{" +
                "diameterAbove=" + diameterAbove +
                ", diameterBelow=" + diameterBelow +
                '}';
    }
}
