package day0416collection.pracite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Dog {
     String name;
     int age;
    static LinkedList<Dog> arr =new LinkedList();
    static {



        Dog d1=new Dog();
        d1.age =5;
        d1.name ="五哈";
        Dog d2=new Dog();
        d2.age =6;
        d2.name ="六哈";
        Dog d3=new Dog();
        d3.age =7;
        d3.name ="七哈";
        Dog d4=new Dog();
        d4.age =5;
        d4.name ="五哈";
        Dog d5=new Dog();
        d5.age =7;
        d5.name ="七哈";
        Dog d6=new Dog();
        d6.age =5;
        d6.name ="五哈";
        arr.add(d1);
        arr.add(d2);
        arr.add(d3);
        arr.add(d4);
        arr.add(d5);
        arr.add(d6);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
