package by.itStep.yandr.megaShopProject.model.entity.container;

import by.itStep.yandr.megaShopProject.model.entity.Milk;
import by.itStep.yandr.megaShopProject.model.entity.Orange;

public class Basket {
    private Orange[] oranges;
    private Milk[] milks;

    public Basket() {
        oranges = new Orange[0];
        milks = new Milk[0];
    }

    public Basket(Orange[] oranges, Milk[] milks) {
        this();
        if (oranges != null) {
            this.oranges = oranges;
        }
        if (milks != null) {
            this.milks = milks;
        }
    }

    public int getOrangesCount() {
        return oranges.length;
    }

    public int getMilksCount() {
        return milks.length;
    }

    //!!!work-flow
    public Orange getOrange(int index) {
        return oranges[index];
    }

    //!!!work-flow
    public Milk getMilk(int index) {
        return milks[index];
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
        Milk[] temp = new Milk[oranges.length - 1];
        for (int i = 0, j = 0; i < milks.length; i++) {
            if (i != index) {
                temp[j++] = milks[i];
            }
        }
        milks = temp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (oranges == null || milks == null
                || (milks.length == 0 && oranges.length == 0)) {
            builder.append("Basket is empty.");
        } else {
            builder.append("Basket:");
            for (Orange orange : oranges) {
                builder.append("\n").append(orange);
            }
            for (Milk milk : milks) {
                builder.append("\n").append(milk);
            }
        }
        return builder.toString();
    }
}
