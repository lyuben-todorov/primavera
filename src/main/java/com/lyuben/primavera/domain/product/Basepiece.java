package com.lyuben.primavera.domain.product;

import com.lyuben.primavera.domain.product.base.LengthColorProduct;
import com.lyuben.primavera.enumeration.BaseDesign;

import javax.persistence.Entity;
import java.awt.*;
import java.util.EnumSet;

@Entity
public class Basepiece extends LengthColorProduct {
    private EnumSet<BaseDesign> baseDesigns;

    public Basepiece(String name, String brand, int price, int availability, int length, Color color, EnumSet<BaseDesign> baseDesigns) {
        super(name, brand, price, availability, length, color);
        this.baseDesigns = baseDesigns;
    }

    public EnumSet<BaseDesign> getBaseDesigns() {
        return baseDesigns;
    }

    public void setBaseDesigns(EnumSet<BaseDesign> baseDesigns) {
        this.baseDesigns = baseDesigns;
    }
}
