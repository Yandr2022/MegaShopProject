package by.itStep.yandr.megaShopProject.model.entity.abstracts;

import java.util.Objects;

public class Product implements  Comparable<Product>{
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return "price = " + price;
    }


    @Override
    public int compareTo(Product o) {
            return Double.compare(price,o.price);//ascending
        }
    }

