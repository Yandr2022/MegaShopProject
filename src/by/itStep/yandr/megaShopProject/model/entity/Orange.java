package by.itStep.yandr.megaShopProject.model.entity;

import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;

import java.util.Objects;

public class Orange extends Product {
    private int diameter;
    private int vitaminC;

    public Orange() {

    }

    public Orange(int diameter, int vitaminC, double price) {
        super(price);
        this.diameter = diameter;
        this.vitaminC = vitaminC;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(int vitaminC) {
        this.vitaminC = vitaminC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Orange orange = (Orange) o;
        return diameter == orange.diameter && vitaminC == orange.vitaminC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), diameter, vitaminC);
    }

    @Override
    public int compareTo(Product o) {
        if (getClass() != o.getClass()) return 1;
        Orange orange = (Orange) o;
        if (diameter > orange.diameter) {
            return 1;
        } else if (diameter < orange.diameter) {
            return -1;
        } else return 0;

    }

    @Override
    public String toString() {
        return "Orange {" +
                "diameter = " + diameter +
                ", vitaminC = " + vitaminC +
                ", " + super.toString() + "}";
    }
}
