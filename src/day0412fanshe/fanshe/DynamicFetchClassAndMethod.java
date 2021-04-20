package day0412fanshe.fanshe;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class DynamicFetchClassAndMethod {
    public static void main(String[] args) {
        //程序中加载配置文件，创建了一个pro.properties文件，给类名和方法配置好位置
        ClassLoader classLoader=DynamicFetchClassAndMethod.class.getClassLoader();
        //输入流
        InputStream inputStream=classLoader.getResourceAsStream("day0412fanshe/fanshe/pro.properties");
        Properties properties =new Properties();
        try {
            properties.load(inputStream);
            String className = properties.getProperty("className");
            String methodName = properties.getProperty("methodName");
            System.out.println("className"+className);
            System.out.println("methodName"+methodName);
            //反射
            //类，获取属性和方法
            //①创建字节码文件类

            Class cls =Class.forName(className);
            //可以直接给class写路径但是，我们子啊配置文件写好了
//            Class cls =Class.forName("day0412fanshe.fanshe.Student");

            //获取自定义类的方法,用对象method来做地址引用，也就是methodName =getStudentName
            Method method=cls.getDeclaredMethod(methodName);
//            Method method=cls.getDeclaredMethod(day0412fanshe.fanshe.Student);
            //实例化字节码文件（当前类）的一个对象
            Object o=cls.newInstance();
            Student o1=new Student();

            //调用对象的方法，获取返回值
            System.out.println("开始调用Student的"+method.getName());
            String studentName =(String) method.invoke(o1);
            System.out.println("+studentName"+studentName);

        } catch (IOException | ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


}
