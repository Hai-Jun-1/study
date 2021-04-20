package pet;

public class Cat extends Pet{
    String food1 ="鱼";
    String food2 ="猫粮";
    String food3 ="鸡胸肉";
    String[]foods={"鱼","猫粮","鸡胸肉"};
    public void eat(String food){
        System.out.println(sex+name+"吃"+food);
    }
}
