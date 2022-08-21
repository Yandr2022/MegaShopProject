package by.itStep.yandr.megaShopProject.model.entity.abstracts;

public class Product {
    private double price;

    public Product() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "price = " + price;
    }
}
