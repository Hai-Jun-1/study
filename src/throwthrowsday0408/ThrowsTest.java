package throwthrowsday0408;

import java.util.Scanner;

public class ThrowsTest {
    public static void main(String[] args) {
        TrowsDemo01 t = new TrowsDemo01();
        try {
            t.setAge(1001);
            System.out.println("年龄是" + t.getAge());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("对输入非法进行处理");
        }
    }
}
