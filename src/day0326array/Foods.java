package day0326array;

public class Foods extends Goods {
    public void printInfo() {

        System.out.println("价格：" + (super.price = 50.0));
    }

    public Goods getClassType() {

        return new Foods();
    }
}
