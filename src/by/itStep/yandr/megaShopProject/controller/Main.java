package by.itStep.yandr.megaShopProject.controller;

import by.itStep.yandr.megaShopProject.model.entity.Bread;
import by.itStep.yandr.megaShopProject.model.entity.Milk;
import by.itStep.yandr.megaShopProject.model.entity.Orange;
import by.itStep.yandr.megaShopProject.model.entity.container.DynamicBasket;
import by.itStep.yandr.megaShopProject.model.logic.BasketSorter;

import by.itStep.yandr.megaShopProject.model.logic.sortStrategy.SortByPriceDescending;


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

        DynamicBasket dynamicBasket = new DynamicBasket();
        dynamicBasket.add(milk1);
        dynamicBasket.add(milk2);
        dynamicBasket.add(milk3);
        dynamicBasket.add(milk4);
        dynamicBasket.add(orange1);
        dynamicBasket.add(orange2);
        dynamicBasket.add(orange3);
        dynamicBasket.add(bread);
        dynamicBasket.add(bread1);
        BasketSorter.sort(dynamicBasket, new SortByPriceDescending());

        System.out.println(dynamicBasket);


    }


}
