package day0323;

import java.util.Scanner;


public class Demo04XiuGai {
    public static void main(String[] args) {
        System.out.println("请选择购买的商品：");
        System.out.println("1、T恤，2、网球鞋、3、网球拍");

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("请输入商品编号1-3或输入n退出");
            String id = input.next();

            //if ("n".equals(id)) {//==的用法
            if ("n".equals(id)) {
                System.out.println("感谢惠顾，再见！");
                break;
            } else {
                boolean b=false;
                switch (id) {
                    case "1": {
                        System.out.println("您输入的商品号是：" + id);
                        double price1 = 220.00;
                        System.out.println("T恤的价格是：￥" + price1);
                        System.out.println("是否继续？（y/n）");
                        break;
                    }
                    case "2": {
                        System.out.println("您输入的商品号是：" + id);
                        System.out.println("商品是：" + id + "号");
                        System.out.println("是否继续？（y/n）");
                      break;
                    }
                    case "3": {
                        System.out.println("您输入的商品号是：" + id);
                        System.out.println("商品是：" + id + "号");
                        System.out.println("是否继续？（y/n）");
                        break;
                    }
                    default: {
                        System.out.println("编号有误，输入不合法");
                        System.out.println("是否继续？（y/n）");
                        b=true;
                        //再次想让，用户输入浏览，用continue，跳出当前循环

                         continue;
                    }
                }


                if (b) {
                    //再次想让，用户输入浏览，用continue，跳出当前循环
                    continue;
                }else{

                }

            }

        }
    }
}



