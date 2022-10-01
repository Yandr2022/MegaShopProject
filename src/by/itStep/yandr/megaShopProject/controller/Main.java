package by.itStep.yandr.megaShopProject.controller;

import by.itStep.yandr.megaShopProject.model.entity.Bread;
import by.itStep.yandr.megaShopProject.model.entity.Milk;
import by.itStep.yandr.megaShopProject.model.entity.Orange;
import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;
import by.itStep.yandr.megaShopProject.model.entity.container.DynamicBasket;
import by.itStep.yandr.megaShopProject.model.entity.container.FixedBasket;

import by.itStep.yandr.megaShopProject.model.entity.iterator.ArrayIterator;
import by.itStep.yandr.megaShopProject.model.entity.iterator.DynamicBasketIterator;
import by.itStep.yandr.megaShopProject.model.entity.iterator.FixedBasketIterator;
import by.itStep.yandr.megaShopProject.model.entity.iterator.MyIterator;
import by.itStep.yandr.megaShopProject.model.logic.ShopAssistance;


public class Main {
    public static void main(String[] args) {
        Orange orange1 = new Orange(100,2000,2.5);
        Orange orange2 = new Orange(200,4000,5);
        Orange orange3 = new Orange(300,6000,7.5);
        Milk milk1 = new Milk(1000,3.5,2.5);
        Milk milk2 = new Milk(1500,3.5,3);
        Milk milk3 = new Milk(2000,3.5,4.2);
        Milk milk4 = new Milk(4000,2.5,5);
        Bread bread =new Bread("White","High",3.4);
        Bread bread1 =new Bread("Black","Middle",2);

        DynamicBasket basket = new DynamicBasket();
        basket.add(milk1);
        basket.add(milk2);
        basket.add(milk3);
        basket.add(milk4);
        basket.add(orange1);
        Product[] products = {milk1,orange1,milk4};

       MyIterator iterator = new ArrayIterator(products);

        double total = ShopAssistance.calculateTotalPrice(iterator);
        System.out.println(total);


//        dynamicBasket.add(orange2);
//        dynamicBasket.add(orange3);
//        dynamicBasket.add(bread);
//        dynamicBasket.add(bread1);
//
//        for (int i = 0; i< basket.size();i++){
//            System.out.println(basket.get(i));
//        }

//       BasketSorter.sort(dynamicBasket, new SortByPriceAscending());

////        System.out.println(dynamicBasket);


    }


}
