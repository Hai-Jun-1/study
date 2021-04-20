package day0330private;

import java.util.Scanner;

public class Demo01PrivateGouGouTest {
    public static void main(String[] args) {
        Demo01PrivateGouGou gou=new Demo01PrivateGouGou();
        Scanner input=new Scanner(System.in);
        System.out.println("欢迎进入宠物管理系统！");
        System.out.println("请输入新增小狗的名字：");
        gou.setName(input.next());
        System.out.println("请选择小狗的年龄：1-20之间");
        gou.setAge(input.nextInt());
        System.out.println("请输入新增小狗的性别：1、公仔 2、仙女");
        gou.setSex(input.next());
        System.out.println("请选择小狗的健康值：(1~100)");
        gou.setHealth(input.nextInt());
        System.out.println("小狗的基本信息");
        System.out.println("宠物的名字是："+gou.getName()+"\t"+"宠物的性别是："+gou.getSex()+"\t"+"宠物的年龄是："+gou.getAge()+"\t"+"宠物的健康值是："+gou.getHealth());
    }
}
