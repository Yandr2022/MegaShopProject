package by.itStep.yandr.megaShopProject.model.logic.sortStrategy;

import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;

public interface ProductSortable {
    boolean compare (Product pr1,Product pr2);
}
