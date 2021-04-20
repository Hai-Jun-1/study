package day0412fanshe.practive;

import day0412fanshe.fanshe.DynamicFetchClassAndMethod;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Declared {
    public static void main(String[] args) throws IOException {
        //1、程序中加载配置文件，创建了一个pro.properties文件，给类名和方法配置好位置
        ClassLoader classLoader= Declared.class.getClassLoader();
        //1.1输入流
        InputStream inputStream=classLoader.getResourceAsStream("day0412fanshe/practive/propp.properties");
        Properties properties =new Properties();

        //2、创建类对象
        try{
            properties.load(inputStream);
            String className =properties.getProperty("className");
            String methodName =properties.getProperty("methodName");
            //把自定义Person类的set修改方法名key键传给method对象
            String methodName1 =properties.getProperty("method");
            System.out.println("className："+className);
            System.out.println("methodName:"+methodName);
            System.out.println("methodName1:"+methodName1);

            //开始反射
            //①、将Person类那来传进classForname，
            Class cls =Class.forName(className);
            //②获取Person结构中的一个方法,methodName =getName,通过配置文件流，传给method对象
            Method method =cls.getDeclaredMethod(methodName);
            //③创建Person的对象
            Person p=new Person();
            //④调用对象的方法，获取到返回的数值赋值给一个新的变量，输出结果
            String s= (String) method.invoke(p);
            System.out.println("名字是："+s);

            //②获取Person结构中的一个方法,method1 =setName,通过配置文件流，传给method对象
            Method method1 =cls.getDeclaredMethod(methodName1,String.class);
            Person p1=new Person();
            method1.invoke(p1, new String("小刚"));
            //③创建Person的对象
            //④调用对象的方法，修改到返回的数值赋值给一个新的变量，输出结果
            String s1= (String) method.invoke(p1);
            System.out.println("调用setName方法修改后的名字是："+s1);

        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
