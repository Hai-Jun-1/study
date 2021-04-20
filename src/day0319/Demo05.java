package day0319;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //输入一个5位数的数字
        System.out.println("亲，请输入你的会员卡号");
        Scanner num = new Scanner(System.in);
        int sum = num.nextInt();

        if(sum>=10000&&sum<=99999) {
            //个位，
            int a = sum % 10;
            System.out.println("您的卡号，个位数为" + a);
            //十位
            int b = (sum % 100) / 10;
            System.out.println("您的卡号，十位数为" + b);
            //百位
            int c = (sum % 1000) / 100;
            System.out.println("您的卡号，百位数为" + c);
            //千位
            int d = (sum %10000)/1000;
            System.out.println("您的卡号，千位数为" + d);
            //万位
            int e = sum / 10000;
            System.out.println("您的卡号，万位数为" + e);
            int f = a + b + c + d+e;
            System.out.println("您的卡号，5位数总和为" + f);
        }else{
            System.out.println("你输入的会员卡号位数有错误");
        }
    }
}
