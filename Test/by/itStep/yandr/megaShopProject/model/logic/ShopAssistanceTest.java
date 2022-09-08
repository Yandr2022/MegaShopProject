package by.itStep.yandr.megaShopProject.model.logic;

import by.itStep.yandr.megaShopProject.model.entity.Bread;
import by.itStep.yandr.megaShopProject.model.entity.Milk;
import by.itStep.yandr.megaShopProject.model.entity.Orange;
import by.itStep.yandr.megaShopProject.model.entity.container.DynamicBasket;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopAssistanceTest {
    @Test
    public void testCalculateTotalPrice(){
        Orange orange = new Orange(200,3000,4.5);
        Milk milk1 = new Milk(1000,3.5,2.5);
        Milk milk2 = new Milk(1000,3.5,2.5);
        Milk milk3 = new Milk(1000,3.5,2.5);
        Milk milk4 = new Milk(1000,3.5,2.5);
        Bread bread = new Bread("White","Best",2.5);


        DynamicBasket dynamicBasket = new DynamicBasket();
        dynamicBasket.add(milk1);
        dynamicBasket.add(milk2);
        dynamicBasket.add(milk3);
        dynamicBasket.add(milk4);
        dynamicBasket.add(orange);
        dynamicBasket.add(bread);
         double expected = 17;
         double actual = ShopAssistance.calculateTotalPrice(dynamicBasket);
        assertEquals(expected,actual,0.0);
    }
}
