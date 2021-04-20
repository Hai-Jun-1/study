package day0407niming;

import java.util.Random;
import java.util.Scanner;

public class ExceptionTtyFinal {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        Random random =new Random(1);
        try{
            int num=random.nextInt(6);
            String[] arr=new String[]{"时","间","是"};
            for (int i = 0; i < arr.length; i++) {
                if (i==(num-1)){
                    System.out.println("该随机数的科目为："+arr[i]);
                    break;
                }
            }
        }catch (Exception e){
            System.err.println("出现错误");
            e.printStackTrace();
        }finally{
            System.out.println("欢迎提出建议");
        }

    }
}
