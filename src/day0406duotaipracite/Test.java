package day0406duotaipracite;

import day0326array.Goods;

public class Test {
    public static void main(String[] args) {
        Fruits f=new Fruits();
        f.kind="苹果";
        f.price=100;
        Process.processGods(f);
        Gods c=new Foods();
        c.kind="面包";
        c.price=10;
        Process.processGods(c);
        Tv t=new Tv();
        t.kind="乐视";
        t.price=1000;
        Process.processGods(t);
    }
}
