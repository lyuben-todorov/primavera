package com.lyuben.primavera.domain.product;

import com.lyuben.primavera.domain.product.base.DoubleDiameterProduct;
import com.lyuben.primavera.enumeration.VaseDesign;

import javax.persistence.Entity;
import java.awt.*;
import java.util.EnumSet;

@Entity
public class Vase extends DoubleDiameterProduct {
    private EnumSet<VaseDesign> vaseDesigns;
    private Color color;
    private int height;
    private int glassThickness;

    public Vase(String name, String brand, int price, int availability, double diameterTop, double diameterBottom, EnumSet<VaseDesign> vaseDesigns, Color color, int height, int glassThickness) {
        super(name, brand, price, availability, diameterTop, diameterBottom);
        this.vaseDesigns = vaseDesigns;
        this.color = color;
        this.height = height;
        this.glassThickness = glassThickness;
    }

    public EnumSet<VaseDesign> getVaseDesigns() {
        return vaseDesigns;
    }

    public void setVaseDesigns(EnumSet<VaseDesign> vaseDesigns) {
        this.vaseDesigns = vaseDesigns;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getGlassThickness() {
        return glassThickness;
    }

    public void setGlassThickness(int glassThickness) {
        this.glassThickness = glassThickness;
    }
}
