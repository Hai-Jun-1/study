package day0326array;

public class Sale {


    public static void judgePrice(Goods goods){//Goods goods =new Goods()
        if(goods.getClassType() instanceof Tvs){
            System.out.println("该商品为Tvs类");
            Tvs tvs =(Tvs) goods;
            ((Tvs) goods).printInfo();
            System.out.println("此类商品打折后价格为："+  (goods.price*0.8));
        }else if(goods.getClassType() instanceof Foods){
            System.out.println("该商品为Foods类");
            Foods foods =(Foods) goods;
            ((Foods) goods).printInfo();
            System.out.println("此类商品打折后价格为："+  (goods.price*0.9));
        }else{
            System.out.println("查无此类！");
        }
    }

}
