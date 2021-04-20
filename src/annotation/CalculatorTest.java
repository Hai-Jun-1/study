package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class CalculatorTest {
    public static void main(String[] args) {

        Class cls = Calculator.class;
        Method[] methods = cls.getDeclaredMethods();
        Method method;
        Annotation[] annotations;
        int err = 0;//记录错误方法个数
        try {
            Object o = cls.newInstance();
            for (int i = 0; i < methods.length; i++) {
                method = methods[i];
                annotations = method.getAnnotations();//获得方法的注解
                System.out.println(method.getName() + "有" + annotations.length + "个注释");
                if (annotations.length > 0) {
                    try {
                        method.invoke(o, 1, 0);
                    } catch (Exception e) {
                        err++;
                        System.out.println(method.getName() + "方法出现异常。方法信息是：" + e.getCause());
                    }
                }
            }
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}

