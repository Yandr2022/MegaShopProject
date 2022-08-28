package by.itStep.yandr.megaShopProject.model.logic.sortStrategy;

import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;

public class SortByPriceAscending implements ProductSortable {
    @Override
    public boolean compare(Product pr1, Product pr2) {
        return pr1.getPrice() > pr2.getPrice();
    }
}
