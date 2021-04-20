package day0406duotaipracite;

import day0326stacktemp.Print;

/*
业务处理，处理价格类
 */
public class Process {


    public  static Gods processGods(Gods gods) {

        if (gods instanceof Tv) {
//            ((Tv)gods).printPrice();
            gods.price = (double) gods.price * 0.6;
            System.out.println("种类是：" + gods.kind + "\t" + "价格是" + gods.price);
        } else if (gods instanceof Foods) {
            gods.price = (double) gods.price * 0.8;
            System.out.println("种类是：" + gods.kind + "\t" + "价格是" + gods.price);
        } else if (gods instanceof Fruits) {
            gods.price = (double) gods.price * 0.7;
            System.out.println("种类是：" + gods.kind + "\t" + "价格是" + gods.price);
        } else {
            System.out.println("无");
        }
        return gods;
    }
}

