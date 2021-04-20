package day0402duotai;

public class Demo01Test {
    public static void main(String[] args) {
        Demo01OverrideDog d= new Demo01OverrideDog();
        Demo01OverrideCat c= new Demo01OverrideCat();
        System.out.println("宠物的自白");
        d.method();
        c.method();
    }
}
