package by.itStep.yandr.megaShopProject.model.entity.comparator;

import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;

import java.util.Comparator;

public class SortByPriceDescending implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}
