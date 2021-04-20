package day0323;

import java.util.Scanner;

public class Demo07For {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入一个值");
        int num = input.nextInt();
        int a=-1;
        int b=7;
        int c= a+b;
        for (int i =0; i <=num ; i++) {
            a++;
            b--;
            System.out.println(a+"+"+b+"="+c);
        }
        for (int i = 0; i < num; i++) {
            System.out.println(i+"+"+"num-i"+"="+num);
        }

    }
}
