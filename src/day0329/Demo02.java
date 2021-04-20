package day0329;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner input = new Scanner(System.in);
        System.out.println("输入4家店的价格");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("输入" + (i + 1) + "家店的价格为：");
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("店铺最低的价格为：" + min);
    }
}
