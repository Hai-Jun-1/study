package day0323;

import java.util.Scanner;

public class Demo08DoWhile {
    public static void main(String[] args) {



        int sum = 0;
        int i = 0;
        for (; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("for循环，0-100所有偶数之和为：" + sum);

        //到这里的时候，已经i已经变成了100；
        do {
            if (i % 2 == 0) {
                i+=2;
                sum += i;
            }
        } while (i <= 98);
        System.out.println("do,while循环，0-100所有偶数之和为：" + sum);

    }

}
