package day0412fanshe.pactive1;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Properties;

public class DynamicDeclared {
    public static void main(String[] args) {
        //1、从配置文件加载类，从一个pop.properties文件，得到类的名字
        ClassLoader classLoader = DynamicDeclared.class.getClassLoader();
        //1.1、传入流
        InputStream inputStream = classLoader.getResourceAsStream("day0412fanshe/pactive1/pop.properties");
        Properties properties = new Properties();

        try {
            properties.load(inputStream);
            String className = properties.getProperty("className");

            //2、反射
            //2.1、创建class类，将Person类传入,获取属性和方法
            Class cls = Class.forName(className);
            Object object = cls.newInstance();
//            //2.2、获取Person类里的get方法
//            Method method =cls.getDeclaredMethod();
            //2.2、获取Person类里的属性

           /* //实例化字节码文件（当前类）的一个对象
            Person p = new Person();
            p.name = "姓名";
            p.mobile = 0;
            p.sex = "性别";
            Person p0 = new Person();
            p0.name = "二哈";
            p0.mobile = 1666;
            p0.sex = "男";
            Person p1 = new Person();
            p1.name = "三哈";
            p1.mobile = 1777;
            p1.sex = "男";
            Person p2 = new Person();
            p2.name = "四哈";
            p2.mobile = 1888;
            p2.sex = "男";
            Person p3 = new Person();
            p3.name = "五哈";
            p3.mobile = 1999;
            p3.sex = "男";*/


            //获取所有类的属性
            Field[] field = cls.getDeclaredFields();
            Person p=new Person();
            Person[] person=p.getArr();
            for (int i = 0; i < field.length; i++) {
                System.out.println(field[i]);
            }
            //遍历所有属性
            for (int i = 0; i < person.length; i++) {
                object = person[i];
                for (int j = 0; j < field.length; j++) {
                    if (!(field[j].getName().equals("arr"))) {
                        String s = "get" + field[j].getName().substring(0, 1).toUpperCase() + field[j].getName().substring(1);
//                    System.out.println(field[j].getName().substring(0, 1).toUpperCase());//截取n，用toUpperCase升级成大写N
//                    System.out.println(field[j].getName().substring(1));
                        Method method1 = cls.getDeclaredMethod(s);
                        Object s1 = method1.invoke(object);
                        System.out.print("\t" + s1);
                    }else{
                        continue;
                    }
                }
                System.out.println();
            }


            /*//遍历所有方法
            for (int i = 0; i < methods.length ; i++) {
                System.out.println("methods name="+methods[i].getName());
            }
            System.out.println("方法get:"+methods[0].getName().substring(0,1).toUpperCase());*/

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
