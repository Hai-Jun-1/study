package day0401exntds;

import java.util.Scanner;

public class Text {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Cat c=new Cat();
        Dog d=new Dog();


        System.out.println("欢迎进入宠物管理系统"+"\n"+"请选择你的宠物，1、狗；2、猫");
        int e =input.nextInt();
        d.getdEat();
        for (int i = 1; i <=2; i++) {
            if (e==1){
                System.out.println(d.name);
                System.out.println(d.sex);
                System.out.println(d.getdEat());
                break;
            }
            if (e==2){
                System.out.println(c.name);
                System.out.println(c.sex);
                System.out.println(c.getcEat());
                break;
            }
            else{
                System.out.println("数据错误");
                break;
            }
        }
    }
}