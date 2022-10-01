package by.itStep.yandr.megaShopProject.model.logic;

import by.itStep.yandr.megaShopProject.model.entity.iterator.Iterable;
import by.itStep.yandr.megaShopProject.model.entity.iterator.MyIterator;

public class ShopAssistance {

    private ShopAssistance() {
    }

    public static double calculateTotalPrice(Iterable iterable) {
        MyIterator iterator = iterable.getIterator();
        double total = 0;
        while (iterator.hasNext()) {
            total += iterator.next().getPrice();
        }
        return total;
    }
}

