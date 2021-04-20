package day0326stacktemp;

public class  Tvs extends Goods {
    public void print(){
        System.out.println(name+"：￥"+money);
    }
    public void daZhe(){
        System.out.println(name+"：￥"+money*0.9);
    }
}
