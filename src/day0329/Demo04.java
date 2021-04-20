package day0329;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] arr = new double[3][5];
        double sum1=0;double sum=0.0;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("*****第"+(i+1)+"个班*****");
            for (int j = 0; j < arr[i].length; j++) {
                count++;
                System.out.println("请输入第"+(j+1)+"位学生的成绩");
                arr[i][j] =input.nextDouble();
                sum+=arr[i][j];
            }System.out.println("第"+i+"个班的总成绩为："+sum1);

        }
        System.out.println("各班的总成绩为："+sum);
        System.out.println("各班的平均值为："+sum/count);


    }

}
