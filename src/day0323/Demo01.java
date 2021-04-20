package day0323;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
//        System.out.println("请输入学生的姓名");
//        Scanner name =new Scanner(System.in);
//        String nameStudent = name.next();
//
//
//        Person sexObject = new Person();
//        sexObject.equals(true);
//
//
//        System.out.println("请输入学生的成绩");
//        Scanner source =new Scanner(System.in);
//        int sexsource = source.nextInt();
//
//        /**
//         * 1为男生；
//         * 0为女生；
//         */
//        if ((sexsource<=10)&&(sexObject.equals(true))){
//            System.out.println("该学生的成绩为:"+sexsource+"恭喜你进入男子决赛");
//        }else if((sexsource<=10)&&(sexObject.equals(false))) {
//            System.out.println("该学生的成绩为:"+sexsource+"恭喜你进入女子决赛");
//        }
//        else{
//            System.out.println("该学生的成绩为:"+sexsource+"，很抱歉你未进入决赛");
//        }
        System.out.println("请输入学生的姓名");
        Scanner student = new Scanner(System.in);
        String nameStudent = student.next();

        /**
         * 请输入学生的性别,true为男生，0为false
         */
        System.out.println("请输入学生的性别,true为男生，false为女生");
        boolean sexStudent = student.nextBoolean();


        System.out.println("请输入学生的成绩");
        int sexsource = student.nextInt();

        /**
         * true为男生；
         * false为女生；
         */
        if ((sexsource <= 10) && (sexStudent ==true)) {
            System.out.println("该学生的成绩为:" + sexsource + "恭喜你进入男子决赛");
        } else if ((sexsource <= 10) && (sexStudent == false)) {
            System.out.println("该学生的成绩为:" + sexsource + "，恭喜你进入女子决赛");
        } else {
            System.out.println("该学生的成绩为:" + sexsource + "，很抱歉你未进入决赛");
        }


    }

}
//class Person{
//    public boolean equals(Object obj){
//        //当年相同，月相同。并且日相同，表示对象相等
//        System.out.println("请输入学生的性别,1为男生，0为女生");
//        Scanner sex =new Scanner(System.in);
//        boolean sexStudent = sex.nextBoolean();
//        if (sexStudent==true){
//            return true;
//        }else{
//            return false;
//        }
//    }
//}