package by.itStep.yandr.megaShopProject.controller;

import by.itStep.yandr.megaShopProject.model.entity.Bread;
import by.itStep.yandr.megaShopProject.model.entity.Milk;
import by.itStep.yandr.megaShopProject.model.entity.Orange;
import by.itStep.yandr.megaShopProject.model.entity.container.Basket;
import by.itStep.yandr.megaShopProject.model.logic.ShopAssistance;


public class Main {
    public static void main(String[] args) {
        Orange orange1 = new Orange(200,3000,4.5);
        Orange orange2 = new Orange(200,3000,4.5);
        Orange orange3 = new Orange(200,3000,4.5);
        Orange orange4 = new Orange(200,3000,4.5);
        Milk milk1 = new Milk(1000,3.5,2.5);
        Milk milk2 = new Milk(1000,3.5,2.5);
        Milk milk3 = new Milk(1000,3.5,2.5);
        Milk milk4 = new Milk(1000,3.5,2.5);
        Bread bread = new Bread("White","Best",2.5);
        Basket basket = new Basket();
        basket.add(milk1);
        basket.add(milk2);
        basket.add(milk3);
        basket.add(milk4);
        basket.add(orange1);
        basket.add(orange2);
        basket.add(orange3);
        basket.add(orange4);

        System.out.println(basket);
        double total = ShopAssistance.calculateTotalPrice(basket);
        System.out.println("Total price: "+ total);


    }


}
