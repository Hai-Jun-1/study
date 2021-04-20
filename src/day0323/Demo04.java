package day0323;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        System.out.println("请选择购买的商品：");
        System.out.println("1、T恤，2、网球鞋、3、网球拍");

        for (int i = 1; i <= 100; i++) {
            System.out.println("请输入商品编号1-3或输入n退出");
            Scanner input = new Scanner(System.in);
            String id = input.next();
//            if ("n".equals(id)) {
            if("n".equals(id)==false){
                switch (id) {
                    case "1": {
                        System.out.println("您输入的值是：" + id);
                        double price1 = 220.00;
                        System.out.println("T恤的价格是：￥" + price1);
                        System.out.println("是否继续？（y/n）");
                        break;
                    }
                    case "2": {
                        System.out.println("您输入的值是：" + id);
                        System.out.println("商品是网球：" + id + "号");
                        System.out.println("是否继续？（y/n）");
                        break;
                    }
                    case "3": {
                        System.out.println("您输入的值是：" + id);
                        System.out.println("商品是：" + id + "号");
                        System.out.println("是否继续？（y/n）");
                        break;
                    }
                    case "y":{
                        System.out.println("继续,挑选商品");
                        continue;
                    }
                    default:{
                        System.out.println("编号有误,输入不合法");
                        System.out.println("是否继续？（y/n）");
                    }

                }
            } else {
                System.out.println("感谢惠顾，再见！");
                break;
            }
            i++;
        }
    }
}

