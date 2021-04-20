package day0325object;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        StudentDemo01 s1 = new StudentDemo01();
        TeacherStudent t1 = new TeacherStudent();
        s1.method1("张浩", 10, "S1班", "篮球");
        t1.method2("王老师", "计算机", "使用java语言", 5);







        Scanner ob = new Scanner(System.in);
        System.out.println("输入double");
        double a = ob.nextDouble();
        switch ((int) a) {
            case 1: {

            }
            case 2: {

            }
        }
        System.out.println("输入布尔类型");
        boolean b = ob.nextBoolean();

        if (b || !(b)) {

        }
        /*switch (b) {
            case true: {

            }
            case false: {

            }
        }*/

        System.out.println("输入byte");
        byte d = ob.nextByte();
        switch (d) {
            case '1': {

            }
            case 'a': {

            }
        }
        System.out.println("输入char");
        char e = '1';
        switch (e) {
            case '1': {

            }
        }
    }
}
