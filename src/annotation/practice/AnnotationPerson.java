package annotation.practice;
import java.lang.reflect.Method;
import java.util.Scanner;

public class AnnotationPerson {
    @AnnotationZj()
    public void doSome() {}
    public static void main(String[] args) throws Exception {
        //获取AnnotationPerson的doSome方法上面的注解信息

        //反射，获取AnnotationPerson类
        Class cls = Class.forName("annotation.practice.AnnotationPerson");
        //获取doSome方法
        Method method = cls.getDeclaredMethod("doSome");
        //可以获取这个方法上的注解
        AnnotationZj annotationZj1=method.getAnnotation(AnnotationZj.class);
        System.out.println(annotationZj1.name());
        System.out.println(annotationZj1.passWord());

        //判断这个方法上是否存在这个注解
        if (method.isAnnotationPresent(AnnotationZj.class)) {
            AnnotationZj annotationZj = method.getAnnotation(AnnotationZj.class);
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入用户名");
            String a = scanner.next();
            System.out.println("输入密码");
            String b = scanner.next();
            if (a.equals(annotationZj.name()) &&
                    b.equals(annotationZj.passWord())) {
                System.out.println("登录成功");
            }else{
                System.out.println("登录失败");
            }
        }
    }
}
