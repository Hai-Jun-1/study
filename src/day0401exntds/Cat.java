package day0401exntds;

public class Cat extends  Animal {
    String cEat;

    public Cat() {
        this.name ="猫——果果";
        this.sex ="女孩";
        this.cEat="主人：给果果，吃：鱼、猫粮、鸡胸肉";
    }

    public String getcEat() {

        return cEat;
    }

    public void setcEat(String cEat) {
        this.cEat = cEat;
    }
}
