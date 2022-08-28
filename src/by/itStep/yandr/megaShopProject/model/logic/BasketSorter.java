package by.itStep.yandr.megaShopProject.model.logic;

import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;
import by.itStep.yandr.megaShopProject.model.entity.container.Basket;

public class BasketSorter {
    public static void sortByPriceAscending(Basket basket) {
        for (int i = 0; i < basket.getProductsCount() - 1; i++) {
            for (int j = 0; j < basket.getProductsCount() - 1 - i; j++) {
                if (basket.getProduct(j).getPrice() > basket.getProduct(j + 1).getPrice()) {
                    Product temp = basket.getProduct(j);
                    basket.setProduct(j, basket.getProduct(j + 1));
                    basket.setProduct(j + 1, temp);
                }
            }
        }

    }
    public static void sortByPriceDescending(Basket basket) {
        for (int i = 0; i < basket.getProductsCount() - 1; i++) {
            for (int j = 0; j < basket.getProductsCount() - 1 - i; j++) {
                if (basket.getProduct(j).getPrice() < basket.getProduct(j + 1).getPrice()) {
                    Product temp = basket.getProduct(j);
                    basket.setProduct(j, basket.getProduct(j + 1));
                    basket.setProduct(j + 1, temp);
                }
            }
        }

    }
}
