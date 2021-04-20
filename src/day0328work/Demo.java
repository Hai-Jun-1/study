package day0328work;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        /*int[] arr = new int[]{1, 6, 3, 5, 4};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int max = arr[arr.length - 1];
        System.out.println("最大值是："+max);*/
        //2
        int[] arr = new int[5];
        int max =0;
        Scanner input =new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("输入数组的数据");
            arr[i] = input.nextInt();
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
