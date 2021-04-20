package day0331static.father;

import day0331static.uncle.Uncle;
import day0331static.uncle.Uncle;

import java.util.Scanner;


public class HomeText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyHome m = new MyHome();
        MySister s = new MySister();
        Uncle u = new Uncle();

        System.out.println("输入我的姓名");
//        m.name=input.next();
        m.setName(input.next());
        System.out.println("输入我的爱好");
        MyHome.myHobby = input.next();

        System.out.println("输入姐姐的姓名");
//        s.name=input.next();
        s.setName(input.next());
        System.out.println("输入姐姐的爱好");
        MySister.sHobby = input.next();

        System.out.println("输入叔叔的姓名");
        u.setName(input.next());
        System.out.println("输入叔叔的爱好");
        u.setUncleHobby(input.next());
//        Uncle.uncleHobby=input.next();//空

//        System.out.println(m.name);//空null，继承之后重写了属性，但是你用方法传值的时候，方法改变的还是以前继承的属性
//        System.out.println(s.name);//空null，继承之后重写了属性，但是你用方法传值的时候，方法改变的还是以前继承的属性
        System.out.println(u.name);
        System.out.println(MyHome.myHobby);
        System.out.println(MySister.sHobby);
        System.out.println(Uncle.uncleHobby);

        System.out.println("家族爱好相同的成员");
        if ((MyHome.myHobby.equals(MySister.sHobby)) && (MyHome.getUncleHobby().equals(Uncle.uncleHobby))) {
            System.out.println(m.getName() + "\t" + MyHome.myHobby);
            System.out.println(s.getName() + "\t" + MySister.sHobby);
            System.out.println(u.getName() + "\t" + Uncle.getUncleHobby());

        } else if ((MyHome.myHobby.equals(MySister.sHobby))) {
            System.out.println(m.getName() + "\t" + MyHome.myHobby);
            System.out.println(s.getName() + "\t" + MySister.sHobby);
        } else if (MyHome.getUncleHobby().equals(Uncle.uncleHobby)) {
            System.out.println(m.getName() + "\t" + MyHome.myHobby);
            System.out.println(u.getName() + "\t" + Uncle.getUncleHobby());
        } else if (MySister.getUncleHobby().equals(Uncle.uncleHobby)) {
            System.out.println(s.getName() + "\t" + MySister.sHobby);
            System.out.println(u.getName() + "\t" + Uncle.getUncleHobby());
        } else {
            System.out.println("没爱了，没有兴趣爱好一样的，散了吧");
        }

    }
}

