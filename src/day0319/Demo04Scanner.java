package day0319;

import java.util.Scanner;

public class Demo04Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("亲，输入你的年龄：");
        int age = input.nextInt();
        System.out.println("亲，输入你的姓名：");
        String name = input.next();
        System.out.println("亲，输入你的性别：");
        String sex = input.next();
        System.out.println("亲，输入你的择偶性别：");
        String sexpd = input.next();
        System.out.println("亲，输入你的择偶条件：");
        String sextj = input.next();
        int num1=5;
        int num2 = 2;
        int a =num1 % num2;
        System.out.println(a);
        int b =num1/num2;
        System.out.println(b);
    }
}
