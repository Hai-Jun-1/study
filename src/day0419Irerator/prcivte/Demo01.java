package day0419Irerator.prcivte;

import day0412fanshe.pactive1.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01 {
    String name;
    String kind;
    int age;
    public static void main(String[] args) {
        Set<Demo01> list=new HashSet();
        Demo01 d1 =new Demo01();
        d1.name ="一哈";
        d1.kind ="蜡笔小新";
        d1.age =1;
        Demo01 d2 =new Demo01();
        d2.name ="二哈";
        d2.kind ="机器猫";
        d2.age =2;
        Demo01 d3 =new Demo01();
        d3.name ="三哈";
        d3.kind ="灵笼";
        d3.age =3;
        list.add(d1);
        list.add(d2);
        list.add(d3);
        System.out.println("共有狗的数目为："+list.size());
        System.out.println("迭代器Iterator");
        Demo01 d;
        Iterator<Demo01> iterator =list.iterator();
        while(iterator.hasNext()){
            d=iterator.next();
            System.out.println("姓名："+ d.name+",品种:"+ d.kind+",年龄："+ d.age);
        }
        System.out.println("for each增强循环");

        for (Demo01 o:
                list) {
            System.out.println("姓名："+o.name +",品种:"+ o.kind+",年龄："+ o.age);
        }

    }
}
