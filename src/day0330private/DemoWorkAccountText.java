package day0330private;

import java.util.Scanner;

public class DemoWorkAccountText {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        DemoWorkAccount account =new DemoWorkAccount();
        //data输入的日期
        System.out.println("输入的日期为：");
        int d= input.nextInt();
        account.setDate(d);
    }
}
