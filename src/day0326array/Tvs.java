package day0326array;

public class Tvs extends Goods {
    public void printInfo() {
        System.out.println("价格：" + (super.price = 100.0));
    }

    public Goods getClassType() {
        return new Tvs();
    }
}
