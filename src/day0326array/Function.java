package day0326array;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Goods goods1 = new Tvs();
        Goods goods2 = new Foods();
        Sale.judgePrice(goods1);
        Sale.judgePrice(goods2);
    }
}
