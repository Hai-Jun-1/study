package day0418collection.work1;

import day0412fanshe.practive.Declared;
import day0418collection.work.DemoLinkedList;

public class Test {


    public static void main(String[] args) {
        /*String str1 = "通话";
        String str2 = "重地";

//        System.out.println(String.format("str1：%d | str2：%d",  str1.hashCode(),str2.hashCode()));
        System.out.println(str1.hashCode());
        System.out.println(str2 .hashCode());
        System.out.println(str1.equals(str2));//这是比较的值，String重写了*/
        System.out.println("数据"+DateCol.d.size()+"条");
        DateCol a ;
//        a.setName("牛儿");
//        a.setMoney(555);
        int time =0;
        int time1 =0;
        long max =0;
        long max1 =0;
        for (int i = 0; i <DateCol.d.size(); i++) {
            a = DateCol.d.get(i);
            String n =DateCol.d.get(i).getName();
            long m =DateCol.d.get(i).getMoney();
            if (n.equals("张三")){
                time++;
                if (max<m){
                    max=m;
                }else{
                    max=max;
                }
            }
            if (n.equals("李四")){
                time1++;
                if (max<m){
                    max1=m;
                }else {
                    max1=max1;
                }
            }
            System.out.println(a.getName()+a.getMoney());
        }
        System.out.println("***********");
        if (time>time1){
            System.out.println("张三多");
            System.out.println("张三单笔消费最高金额为："+max);
        }else{
            System.out.println("李四多");
            System.out.println("李四单笔消费最高金额为："+max1);
        }
    }
}
