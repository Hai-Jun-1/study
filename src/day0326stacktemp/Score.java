package day0326stacktemp;

import java.util.Scanner;

public class Score {
    String name;
    int score;

    public void method1() {
        Scanner sn =new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sn.next();
        System.out.println("请输入学生成绩");
        int score = sn.nextInt();
        if (score < 60) {
            score += 2;
            System.out.println("该学员的成绩为：" + score);
        }else{
            System.out.println("该学员的成绩为：" + score);
        }
    }
}
