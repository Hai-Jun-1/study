package day0326array;

import java.util.Scanner;

public class Demo01Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum =0;
        int avg =0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入学生的成绩");
            arr[i]=input.nextInt();
            sum +=arr[i];
        }
        avg =sum/ (arr.length);
        System.out.println("该学生的平均成绩为："+avg);
    }
}
