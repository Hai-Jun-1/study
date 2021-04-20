package day0401exntds;

import day0401exntds.Tpiao;

import java.util.Scanner;

public class TPiaoTest {
    static{
        System.out.println("类加载--》1");
    }//静态代码快在类加载时执行，且只执行一次
    static{
        System.out.println("类加载--》2，在main方法之前执行");
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Tpiao t= new Tpiao();

//        for (Tpiao.id=0; Tpiao.id < 10; Tpiao.id++) {
//            System.out.println((Tpiao.id+1)+"号选民姓名:");
//            String name =input.next();
//            t.setName(name);
//            System.out.println("姓名:"+t.getName()+"序号是"+(Tpiao.id+1)+"\t"+"感谢你的投票");
//        }


            System.out.println("在Static静态代码块加载之后输出");

    }
}
