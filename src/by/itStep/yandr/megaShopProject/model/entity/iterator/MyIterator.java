package by.itStep.yandr.megaShopProject.model.entity.iterator;

import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;

public interface MyIterator {
    Product next();
    boolean hasNext();
    void reset();
}
