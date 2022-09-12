package by.itStep.yandr.megaShopProject.model.entity.container;

import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;

public interface Basket {
    int size ();
    Product get(int index);
}
