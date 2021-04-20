package day0325object;

import java.util.Scanner;

public class DemoUser {
    //原用户名
    String username = "admin1";
    //原密码
    int password = 111111;

    public static void main(String[] args) {
        DemoUser user = new DemoUser();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名");
        user.username = input.next();
        System.out.println("请输入密码");
        user.password = input.nextInt();
        if (!"admin".equals(user.username) && (user.password == 111111)) {
            System.out.println("请输入新密码");
            user.password = input.nextInt();
            System.out.println("修改密码成功，您的新密码为：" + user.password);
        } else {
            System.out.println("用户名和密码不匹配！您没有修改的权限");

        }

    }


}


