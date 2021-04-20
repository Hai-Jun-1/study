package day0326stacktemp;

import day0325object.StudentDemo01;

import java.util.Scanner;

public class StudentText extends Score {
    public static void main(String[] args) {
        StudentText s =new StudentText();
        String a = s.name;
        int b = s.score;
        s.method1();
        System.out.println("下一行");
        Score c =new StudentText();
        StudentText A=(StudentText)c;
        A.method1();
    }
}
