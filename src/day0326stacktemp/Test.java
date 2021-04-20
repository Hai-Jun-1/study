package day0326stacktemp;

public class Test {
    public static void main(String[] args) {
        Print print =new Print();
        Goods tv1=new Tvs();
        tv1.name="小米电视机";
        tv1.money=1500;
        print.print(tv1);
        Goods food1= new Foods();
        food1.name="鸡蛋";
        food1.money=1;
        print.print(food1);



    }
}
