package day0328work;

import java.util.Scanner;

public class Demo01WorkArr {
    public static void main(String[] args) {
        double sum =0;
        double[] arr1= new double[5];
        Scanner input= new Scanner(System.in);
        System.out.println("请输入会员本月的消费记录");

        for (int i = 0; i <arr1.length ; i++) {
            System.out.println("请输入第"+(i+1)+"笔购物记录");
            double a = input.nextDouble();
            arr1[i] =a;
            sum+=arr1[i];
        }
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println("序号为:"+(i+1)+"\t\t"+"金额为："+arr1[i]);
        }
        System.out.println("总金额为：\t\t"+sum);
    }
}
