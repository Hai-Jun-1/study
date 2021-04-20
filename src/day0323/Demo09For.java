package day0323;

public class Demo09For {
    public static void main(String[] args) {
//        for (int h=5;h>=1;h--){
//            //列
//            //处理左侧空格
//            for(int l=9;l<=1;l--){
//                if (l>=h){
//                    System.out.print("*");
//                } else{
//                    System.out.print("");
//                }
//
//            }System.out.println("");
//        }
        for (int h = 1; h <= 5; h++) {
            for (int k = 1; k <= 5 - h; k++) {
                System.out.print(" ");
            }
            for (int o = 1; o <= 5; o++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int  a= 0; a < 5; a++) {
            for (int b = 0; a < 5-a ; a++) {
                System.out.print(" ");
            }
            for (int c = 0; c <2*a-1 ; c++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}

