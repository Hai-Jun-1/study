package day0407niming;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.CORBA.INTERNAL;
import java.util.Scanner;

public class ExceptionTry {
    public static void main(String[] args) {
        boolean value1 =ExceptionTry.method(1,1);
        System.out.println(""+value1);
        System.out.println("\n");
        boolean value2 =ExceptionTry.method(1,0);
        System.out.print(value2);
    }

    /**
     * 需求：两数相除求商，不能有异常
     * @param a int类型
     * @param b int类型
     * @return 若是返回值为:true 代表成功，false代表失败
     */
    public static boolean method(int a,int b){
        try{
            int c =a/b;
            System.out.println("计算成功，两数的商为："+c);
            return true;
        }catch (Exception e){
            System.out.println("计算失败：");
            //异常执行失败
            return false;
        }
    }
}
