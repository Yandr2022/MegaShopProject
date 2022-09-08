package by.itStep.yandr.megaShopProject.model.entity.container;

import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;

public class DynamicBasket {
    private Product[] products;

    public DynamicBasket() {
        products = new Product[0];
    }

    public DynamicBasket(Product[] products) {
        this();

        if (products != null) {
            this.products = products;
        }
    }

    public int getProductsCount() {
        return products.length;
    }

    //!!!work-flow
    public Product getProduct(int index) {
        return products[index];
    }

    public void setProduct(int index, Product product){
        products[index]=product;

    }


    public void add(Product product) {
        if (product == null) {
            return;
        }

        Product[] temp = new Product[products.length + 1];

        int i = 0;
        for (; i < products.length; i++) {
            temp[i] = products[i];
        }

        temp[i] = product;
        products = temp;
    }

    //!!!
    public void remove(int index) {
        Product[] temp = new Product[products.length - 1];

        for (int i = 0, j = 0; i < products.length; i++) {
            if (i != index) {
                temp[j++] = products[i];
            }
        }

        products = temp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (products.length == 0) {
            builder.append("Basket is empty.");
        } else {
            builder.append("Basket:");

            for (Product product : products) {
                builder.append("\n").append(product);
            }
        }

        return builder.toString();
    }
}
