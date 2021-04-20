package pet;

import java.util.Random;
import java.util.Scanner;

public class PetChange {
    public static void main(String[] args) {
        Dog teddy =new Dog();
        Cat ragDoll=new Cat();
        teddy.name="泰迪";
        teddy.sex="母";
        ragDoll.name="布偶";
        ragDoll.sex="公";
        Scanner input =new Scanner(System.in);
        System.out.println("欢迎来到宠物管理系统");
        Random random=new Random();
        while(true) {
            System.out.println("请选择宠物1.狗   2.猫");
            String change = input.next();
            if ("1".equals(change)) {
                int num=(int)(Math.random()*teddy.foods.length);
                teddy.eat(teddy.foods[num]);
                break;
            } else if ("2".equals(change)) {
                int num=(int)(Math.random()*ragDoll.foods.length);
                ragDoll.eat(ragDoll.foods[num]);
                break;
            } else {
                System.out.println("输入错误");
            }
        }
    }
}
