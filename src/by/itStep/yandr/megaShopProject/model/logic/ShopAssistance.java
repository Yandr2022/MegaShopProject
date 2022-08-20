package by.itStep.yandr.megaShopProject.model.logic;

import by.itStep.yandr.megaShopProject.model.entity.container.Basket;

public class ShopAssistance {

    private ShopAssistance() {
    }

    public static double calculateTotalPrice(Basket basket) {
        double total = 0;
        for (int i = 0; i < basket.getOrangesCount(); i++) {
            total += basket.getOrange(i).getCost();
        }
        for (int i = 0; i < basket.getMilksCount(); i++) {
            total += basket.getMilk(i).getMoney();
        }
        for (int i = 0; i < basket.getBreadsCount(); i++) {
            total += basket.getBread(i).getPrice();
        }
        return total;
    }
}

