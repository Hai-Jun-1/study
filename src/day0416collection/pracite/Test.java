package day0416collection.pracite;

import day0416collection.News;

public class Test {
    public static void main(String[] args) {

        Dog dog1=new Dog();
        dog1.name="菲菲";
        dog1.age=4;
        Dog.arr.addFirst(dog1);
        Dog e=new Dog();
        e.name="美美";
        e.age=5;
        Dog.arr.addLast(e);
        System.out.println("第一名字："+Dog.arr.getFirst().getName());
        System.out.println("最后名字："+Dog.arr.getLast().getName());
        System.out.println("有" + Dog.arr.size() + "条");
        for (Dog d :
                Dog.arr) {
            System.out.println("一条年龄为:" + d.getName() + "\t" + "的" + d.getAge());
        }

        System.out.println("\n删除第三条狗");
        Dog.arr.remove(2);
        for (Dog d :
                Dog.arr) {
            System.out.println("一条年龄为:" + d.getName() + "\t" + "的" + d.getAge());
        }
        Dog dog=new Dog();
        dog.name ="五哈";
        dog.age =5;
        System.out.println("\n删除指定的狗——五哈\n");
        for (int i = 0; i < Dog.arr.size(); i++) {
            System.out.println(Dog.arr.size());
            if (Dog.arr.get(i).getName().equals("五哈")){
                Dog.arr.remove(i);
                System.out.println(i);
                System.out.println("一条年龄为:" +Dog.arr.get(i).getName() + "\t" + "的" + Dog.arr.get(i).getAge());
            }
        }
        System.out.println(Dog.arr.size());

        for (Dog d :
                Dog.arr) {
            System.out.println("一条年龄为:" + d.getName() + "\t" + "的" + d.getAge());
        }
        System.out.println("判断是否有六哈");
        boolean flag = true;
        for (Dog d:
                Dog.arr) {

            if (d.getName().equals("六哈")) {
                System.out.println("有的");
                flag =false;
                continue;
            }
        }
        if(flag) {
            System.out.println("没有这个狗");
        }
    }
}
