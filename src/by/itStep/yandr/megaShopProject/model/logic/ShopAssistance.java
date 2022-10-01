package by.itStep.yandr.megaShopProject.model.logic;

import by.itStep.yandr.megaShopProject.model.entity.container.Basket;
import by.itStep.yandr.megaShopProject.model.entity.iterator.MyIterator;

public class ShopAssistance {

    private ShopAssistance() {
    }

    public static double calculateTotalPrice(MyIterator iterator) {
        double total = 0;
        while (iterator.hasNext()) {
            total += iterator.next().getPrice();

        }
//        for (int i = 0; i < basket.size(); i++) {
//            total += basket.get(i).getPrice();
//        }

        return total;
    }
}

