package by.itStep.yandr.megaShopProject.model.logic;

import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;
import by.itStep.yandr.megaShopProject.model.entity.container.DynamicBasket;
import by.itStep.yandr.megaShopProject.model.logic.sortStrategy.ProductSortable;

public class BasketSorter {
    public static void sort(DynamicBasket dynamicBasket, ProductSortable sortable) {
        for (int i = 0; i < dynamicBasket.getProductsCount() - 1; i++) {
            for (int j = 0; j < dynamicBasket.getProductsCount() - 1 - i; j++) {
                if (sortable.compare(dynamicBasket.getProduct(j), dynamicBasket.getProduct(j + 1))) {
                    Product temp = dynamicBasket.getProduct(j);
                    dynamicBasket.setProduct(j, dynamicBasket.getProduct(j + 1));
                    dynamicBasket.setProduct(j + 1, temp);
                }
            }
        }
    }

}
