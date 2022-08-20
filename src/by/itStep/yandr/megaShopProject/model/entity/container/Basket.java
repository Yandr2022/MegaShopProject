package by.itStep.yandr.megaShopProject.model.entity.container;

import by.itStep.yandr.megaShopProject.model.entity.Bread;
import by.itStep.yandr.megaShopProject.model.entity.Milk;
import by.itStep.yandr.megaShopProject.model.entity.Orange;

public class Basket {
    private Orange[] oranges;
    private Milk[] milks;
    private Bread[] breads;

    public Basket() {
        oranges = new Orange[0];
        milks = new Milk[0];
        breads = new Bread[0];
    }

    public Basket(Orange[] oranges, Milk[] milks,Bread[]breads) {
        this();
        if (oranges != null) {
            this.oranges = oranges;
        }
        if (milks != null) {
            this.milks = milks;
        }
        if (breads != null) {
            this.breads = breads;
        }
    }

    public int getOrangesCount() {
        return oranges.length;
    }

    public int getMilksCount() {
        return milks.length;
    }

    public int getBreadsCount() {
        return breads.length;
    }

    //!!!work-flow
    public Orange getOrange(int index) {
        return oranges[index];
    }

    //!!!work-flow
    public Milk getMilk(int index) {
        return milks[index];
    }
    //!!!work-flow
    public Bread getBread(int index) {
        return breads[index];
    }

    public void add(Orange orange) {
        if (orange==null){
            return;
        }
        Orange[] temp = new Orange[oranges.length + 1];
        int i = 0;
        for (; i < oranges.length; i++) {
            temp[i] = oranges[i];
        }
        temp[i] = orange;
        oranges = temp;
    }

    public void add(Milk milk) {
        if (milk==null){
            return;
        }
        Milk[] temp = new Milk[milks.length + 1];
        int i = 0;
        for (; i < milks.length; i++) {
            temp[i] = milks[i];
        }
        temp[i] = milk;
        milks = temp;
    }
    public void add(Bread bread) {
        if (bread==null){
            return;
        }
        Bread[] temp = new Bread[breads.length + 1];
        int i = 0;
        for (; i < breads.length; i++) {
            temp[i] = breads[i];
        }
        temp[i] = bread;
        breads = temp;
    }

//!!!
    public void removeOrange(int index) {
        Orange[] temp = new Orange[oranges.length - 1];
        for (int i = 0, j = 0; i < oranges.length; i++) {
            if (i != index) {
                temp[j++] = oranges[i];
            }
        }
        oranges = temp;
    }

///!!!
    public void removeMilk(int index) {
        Milk[] temp = new Milk[milks.length - 1];
        for (int i = 0, j = 0; i < milks.length; i++) {
            if (i != index) {
                temp[j++] = milks[i];
            }
        }
        milks = temp;
    }

    ///!!!
    public void removeBread(int index) {
        Bread[] temp = new Bread[breads.length - 1];
        for (int i = 0, j = 0; i < breads.length; i++) {
            if (i != index) {
                temp[j++] = breads[i];
            }
        }
        breads = temp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (oranges == null || milks == null||breads==null
                || (milks.length == 0 && oranges.length == 0 &&breads.length==0)) {
            builder.append("Basket is empty.");
        } else {
            builder.append("Basket:");
            for (Orange orange : oranges) {
                builder.append("\n").append(orange);
            }
            for (Milk milk : milks) {
                builder.append("\n").append(milk);
            }
            for (Bread bread : breads) {
                builder.append("\n").append(bread);
            }
        }
        return builder.toString();
    }
}
