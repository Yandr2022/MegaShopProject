package by.itStep.yandr.megaShopProject.model.logic;

import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;
import by.itStep.yandr.megaShopProject.model.entity.container.Basket;
import by.itStep.yandr.megaShopProject.model.logic.sortStrategy.ProductSortable;

public class BasketSorter {
    public static void sort(Basket basket, ProductSortable sortable) {
        for (int i = 0; i < basket.getProductsCount() - 1; i++) {
            for (int j = 0; j < basket.getProductsCount() - 1 - i; j++) {
                if (sortable.compare(basket.getProduct(j), basket.getProduct(j + 1))) {
                    Product temp = basket.getProduct(j);
                    basket.setProduct(j, basket.getProduct(j + 1));
                    basket.setProduct(j + 1, temp);
                }
            }
        }
    }

}
