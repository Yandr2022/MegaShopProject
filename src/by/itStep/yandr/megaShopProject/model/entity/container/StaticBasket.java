package by.itStep.yandr.megaShopProject.model.entity.container;

import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;


public class StaticBasket {
    public static final int DEFAULT_SIZE = 10;
    private Product[] array;
    private int size;

    public StaticBasket() {
        array = new Product[DEFAULT_SIZE];
        size = 0;
    }

    public StaticBasket(int capacity) {
        array = new Product[capacity];
        size = 0;
    }

    public StaticBasket(Product[] array) {
        this.array = array;
        size = array.length;
    }

    public Product getProduct(int index) {
        return array[index];
    }

    public void setProduct(int index, Product product) {
        array[index] = product;
    }

    public int capacity() {return array.length;}

    public int size() {return size;
    }

    public void add(Product product) {
        if (product == null) {
            return;
        }
        if (size < array.length) {
            array[size++] = product;
        }

    }

//    //!!!
//    public void remove(int index) {
//
//
//
//        for (int i = 0, j = 0; i < products.length; i++) {
//            if (i != index) {
//                temp[j++] = products[i];
//            }
//        }
//
//        products = temp;
//    }
}

