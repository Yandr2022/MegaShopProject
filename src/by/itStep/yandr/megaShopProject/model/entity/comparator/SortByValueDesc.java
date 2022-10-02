package by.itStep.yandr.megaShopProject.model.entity.comparator;

import java.util.Comparator;

public class SortByValueDesc implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return -Integer.compare(o1, o2);
    }
}
