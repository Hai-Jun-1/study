package day0325object;

import java.util.Scanner;

public class PersonDemo01 {
    String name;
    int age;
    int price;

    public void method() {
        Scanner p1 = new Scanner(System.in);

        for (int i = 1; i < 10; i++) {
            System.out.println("请输入姓名");
            name = p1.next();

            if ("n".equals(name)) {
                System.out.println("退出程序");
                break;
            }
            if (!"n".equals(name)) {
                System.out.println("请输入年龄");
                age = p1.nextInt();
            } else if (age <= 12) {
                System.out.println(name + "的年龄为：" + age + ",门票免费");
            } else if (age > 12 && age <= 20) {
                System.out.println(name + "的年龄为：" + age + ",门票价格为：20");
            } else if (age > 20 && age <= 50) {
                System.out.println(name + "的年龄为：" + age + ",门票价格为：80");
            } else {
                System.out.println(name + "的年龄为：" + age + ",门票价格为：35");
            }

        }
    }

}

