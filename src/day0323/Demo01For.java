package day0323;

import java.util.Scanner;

public class Demo01For {
    public static void main(String[] args){
        //循环输入某同学的S1结业考试的5门成绩。并计算平均分
        Scanner scanner = new Scanner(System.in);
        //1、提升
        System.out.println("请输出第，"+"次的成绩");
        //2、接收输入的成绩
        Double score = scanner.nextDouble();
        //3、变量来保存5门课总成绩
        Double totalScore = 0.0;
        totalScore = totalScore+score;
        //4、计算平均分
        Double avgScore = totalScore/5;
        //5、输出平均分
        System.out.println("五门课的平均分是"+avgScore);
    }
}
