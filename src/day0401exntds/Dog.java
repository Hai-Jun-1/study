package day0401exntds;

public class Dog extends Animal {
    String dEat;

    public Dog() {
        this.name = "狗——豆豆";
        this.sex = "男孩";
        this.dEat = "主人：给豆豆吃骨头、狗粮";

    }

    public String getdEat() {
        return dEat;
    }

    public void setdEat(String dEat) {
        this.dEat = dEat;
    }
}
