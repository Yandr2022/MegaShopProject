package by.itStep.yandr.megaShopProject.model.logic;

import by.itStep.yandr.megaShopProject.model.entity.container.DynamicBasket;

public class ShopAssistance {

    private ShopAssistance() {
    }

    public static double calculateTotalPrice(DynamicBasket dynamicBasket) {
        double total = 0;
        for (int i = 0; i < dynamicBasket.getProductsCount(); i++) {
            total += dynamicBasket.getProduct(i).getPrice();
        }

        return total;
    }
}

