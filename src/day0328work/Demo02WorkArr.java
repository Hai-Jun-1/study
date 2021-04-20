package day0328work;

import day0325object.DemoUser;

import java.util.Scanner;

public class Demo02WorkArr {
    public static void main(String[] args) {
        Demo02WorkArr arr = new Demo02WorkArr();
//        int[] arr1 =new int[]{8, 4, 2, 1, 23, 344, 12};
        arr.method1(new int[]{8, 4, 2, 1, 23, 344, 12});
        arr.method2(new int[]{8, 4, 2, 1, 23, 344, 12});
    }
    public void method1(int[] arr1){
        int sum =0;
        for (int i = 0; i < arr1.length; i++) {
            //需求1
            System.out.println("数列序" + i + "号的值是：" + arr1[i]);
            //需求2
            sum += arr1[i];
        }
        System.out.println("数列的和是：" + sum);
    }
    public void method2(int[] arr1){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你想判定的数字");
        int a = input.nextInt();
        boolean flag =true;
//        for (int i = 0; i < arr1.length; i++) {
//            if (a == arr1[i]) {
//                System.out.println("恭喜中奖，符合该数组中序号为：" + i + "数字");
//                flag = false;
//                break;
//            }
//        }
//        if (flag) {
//            System.out.println("未中奖，此数字不存在");
//        }
        /*int i = 0;
        for (; i < arr1.length; i++) {
            if (a == arr1[i]) {
                System.out.println("恭喜中奖，符合该数组中序号为：" + i + "数字");
                flag = false;
                break;
            }
        }
        if (i==7) {
            System.out.println("未中奖，此数字不存在");
        }*/
    }
}
