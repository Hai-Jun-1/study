package day0330private;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args)  {
        Prac p=new Prac();
        Prac[] arr=new Prac[4];
        try {
            Class cls=Class.forName("day0330private.Prac");
            Field[] field=cls.getDeclaredFields();
            System.out.println(arr[0]);
            arr[0].setName("1");
            System.out.println(p.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
