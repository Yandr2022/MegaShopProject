package by.itStep.yandr.megaShopProject.controller;

import by.itStep.yandr.megaShopProject.model.entity.Bread;
import by.itStep.yandr.megaShopProject.model.entity.Milk;
import by.itStep.yandr.megaShopProject.model.entity.Orange;
import by.itStep.yandr.megaShopProject.model.entity.abstracts.Product;
import by.itStep.yandr.megaShopProject.model.entity.comparator.SortByPriceDescending;
import by.itStep.yandr.megaShopProject.model.entity.comparator.SortByValueDesc;
import by.itStep.yandr.megaShopProject.model.entity.container.DynamicBasket;
import by.itStep.yandr.megaShopProject.model.entity.container.FixedBasket;

import by.itStep.yandr.megaShopProject.model.entity.container.ListBasket;
import by.itStep.yandr.megaShopProject.model.entity.iterator.ArrayIterator;
import by.itStep.yandr.megaShopProject.model.entity.iterator.DynamicBasketIterator;
import by.itStep.yandr.megaShopProject.model.entity.iterator.FixedBasketIterator;
import by.itStep.yandr.megaShopProject.model.entity.iterator.MyIterator;
import by.itStep.yandr.megaShopProject.model.logic.ShopAssistance;
import by.itStep.yandr.megaShopProject.util.charStream.ProductStream;

import java.util.*;


public class Main {
    public static void main(String[] args) {

//        Queue<Integer> queue= new ArrayDeque<>();
//        Deque<Integer> deque= (Deque<Integer>)queue;
//        deque.push(22);
//        deque.push(13);
//        deque.push(4);
//        deque.push(5);
//        deque.push(6);
//        while (!queue.isEmpty()){
//            System.out.println(deque.pop());
//        }
//        Orange orange1 = new Orange(100,2000,2.5);
//        Orange orange2 = new Orange(200,4000,5);
//        Orange orange3 = new Orange(300,6000,7.5);
//        Orange []oranges = {orange1,orange2,orange3};
//        ProductStream.writeOranges(oranges,"D:/oranges.txt");
   List<Orange>oranges =  ProductStream.readOranges("D:/oranges.txt");
        for (Orange orange : oranges) {
            System.out.println(orange);
        }
//        Milk milk1 = new Milk(1000,3.5,2.5);
//        Milk milk2 = new Milk(1500,3.5,3);
//        Milk milk3 = new Milk(2000,3.5,4.2);
//        Milk milk4 = new Milk(4000,2.5,5);
//        Bread bread =new Bread("White","High",3.4);
//        Bread bread1 =new Bread("Black","Middle",2);
//        Product[] products= {orange1, orange2,orange3,milk2,bread};
//        Set<Product> set = new TreeSet<>(new SortByPriceDescending());
//        Collections.addAll(set,products);
//        System.out.println(set);
//
//        set = new TreeSet<>();
//        Collections.addAll(set,products);
//        System.out.println();

//        DynamicBasket basket = new DynamicBasket();
//        basket.add(milk1);
//        basket.add(milk2);
//        basket.add(milk3);
//        basket.add(milk4);
//        basket.add(orange1);


//
//        double total = ShopAssistance.calculateTotalPrice(basket);
//        System.out.println(total);


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