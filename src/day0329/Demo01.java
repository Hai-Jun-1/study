package day0329;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a1 = new int[]{160, 30, 40, 19, 100};
        int[] a2 = new int[a1.length + 1];
        System.out.println("输入新加入的数据");

        int c1 = input.nextInt();
        for (int i = 0; i < a1.length; i++) {
            if ((c1 > a2[i + 1]) ) {
//
                int temp1 = a2[i + 1];//2   1,2,3    7,5.
                a2[i + 1] = c1;
                a2[i + 2] = temp1;
//                        for(int j=i+2;j< arr2.length+1;j++){
//                            arr2[j]= arr2[j-1];
//                        }
            }
        }
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + "\t");
        }


        /*int num = input.nextInt();
        System.out.println("----");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i; j < arr1new.length; i++) {
                arr1new[0] = num;
                arr1new[j + 1] = arr1[i];
                break;
            }
        }
//        for (int i = 0; i < arr1new.length; i++) {
//            System.out.println(arr1new[i]);
//        }
        //降序
        for (int i = 0; i < arr1new.length - 1; i++) {
            for (int j = i + 1; j < arr1new.length; j++) {
                if (arr1new[i] < arr1new[j]) {
                    int temp = arr1new[i];
                    arr1new[i] = arr1new[j];
                    arr1new[j] = temp;
                }
            }
        }
        System.out.println("新数组排列后为：");
        for (int i = 0; i < arr1new.length; i++) {
            System.out.print(arr1new[i] + "\t");
        }*/
//            if (max < arr1new[i + 1]) {
//                int temp;
//                temp = arr1new[i + 1];
//                arr1new[i + 1] = max;
//                max = temp;
//            }
//        }
//        for (int i = 0; i < arr1new.length; i++) {
//            System.out.println(arr1new[i]);
//
//        }
    }
}
