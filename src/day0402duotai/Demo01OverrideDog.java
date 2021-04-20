package day0402duotai;

import java.util.Scanner;

public class Demo01OverrideDog extends Demo01OverridePet {
    String kind;
    @Override
    public void method() {
        Scanner input =new Scanner(System.in);
        this.name ="豆子";
        super.method();
        System.out.println("请输入你的品种");
        this.kind = input.next();
        System.out.println("我是一只"+kind);
    }
}
