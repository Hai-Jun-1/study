package day0323;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println("请输入，您的会员卡号,您有一次中奖的机会");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        int num1 = num / 1000;
        int random = (int) (Math.random() * 10);

        if (random == num1) {
            System.out.println("恭喜您，中奖了");
        } else {
            System.out.println("抱歉，奖项与您擦肩而过，再试一次吧");
        }
    }
}
