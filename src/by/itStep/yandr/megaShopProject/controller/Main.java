package by.itStep.yandr.megaShopProject.controller;

import by.itStep.yandr.megaShopProject.model.entity.Milk;
import by.itStep.yandr.megaShopProject.model.entity.Orange;
import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;
import by.itStep.yandr.megaShopProject.model.entity.container.Basket;


public class Main {
    public static void main(String[] args) {
        Orange orange = new Orange(200,3000,4.5);
        Milk milk1 = new Milk(1000,3.5,2.5);
        Milk milk2 = new Milk(1000,3.5,2.5);
        Milk milk3 = new Milk(1000,3.5,2.5);
        Milk milk4 = new Milk(1000,3.5,2.5);
         


        Basket basket = new Basket();
        basket.add(milk1);
        basket.add(milk2);
        basket.add(milk3);
        basket.add(milk4);
        basket.add(orange);

        System.out.println(basket);


    }


}
