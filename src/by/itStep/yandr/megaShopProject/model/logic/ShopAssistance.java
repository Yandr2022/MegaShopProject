package by.itStep.yandr.megaShopProject.model.logic;

import by.itStep.yandr.megaShopProject.model.entity.container.Basket;

public class ShopAssistance {

    private ShopAssistance() {
    }

    public static double calculateTotalPrice(Basket basket) {
        double total = 0;
        for (int i = 0; i < basket.size(); i++) {
            total += basket.get(i).getPrice();
        }

        return total;
    }
}

