package by.itStep.yandr.megaShopProject.controller;

import by.itStep.yandr.megaShopProject.model.entity.Milk;
import by.itStep.yandr.megaShopProject.model.entity.Orange;


public class Main {
    public static void main(String[] args) {
        Orange orange = new Orange(200,3000,4.5);
        Milk milk = new Milk(1000,3.5,2.5);
        System.out.println(orange+"\n"+milk);
    }


}
