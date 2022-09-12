package by.itStep.yandr.megaShopProject.model.logic;

import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;
import by.itStep.yandr.megaShopProject.model.entity.container.DynamicBasket;
import by.itStep.yandr.megaShopProject.model.logic.sortStrategy.ProductSortable;

public class BasketSorter {
    public static void sort(DynamicBasket dynamicBasket, ProductSortable sortable) {
        for (int i = 0; i < dynamicBasket.size() - 1; i++) {
            for (int j = 0; j < dynamicBasket.size() - 1 - i; j++) {
                if (sortable.compare(dynamicBasket.get(j), dynamicBasket.get(j + 1))) {
                    Product temp = dynamicBasket.get(j);
                    dynamicBasket.setProduct(j, dynamicBasket.get(j + 1));
                    dynamicBasket.setProduct(j + 1, temp);
                }
            }
        }
    }

}
