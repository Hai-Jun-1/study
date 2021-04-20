package day0326stacktemp;

public  class Print {
    public Goods print(Goods goods ){
       if (goods instanceof Tvs){
           ((Tvs) goods).daZhe();
       }else if (goods instanceof Foods){
           ((Foods) goods).daZhe();
       }
       return goods;
    }


}
