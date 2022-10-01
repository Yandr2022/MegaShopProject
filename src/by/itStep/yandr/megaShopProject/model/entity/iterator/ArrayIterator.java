package by.itStep.yandr.megaShopProject.model.entity.iterator;

import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;

public class ArrayIterator implements MyIterator {
    private Product[] products;
    private int current;

    public ArrayIterator(Product[] products) {
        this.products = products;
        current = 0;
    }

    @Override
    public Product next() {
        return products[current++];
    }

    @Override
    public boolean hasNext() {
        return current < products.length;
    }

    @Override
    public void reset() {
        current = 0;
    }
}
