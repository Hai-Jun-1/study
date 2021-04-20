package day0323;

public class Demo0999 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }
    private static void test4() {
        for(int i=0;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }
    private static void test3() {

        for(int i=9;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }
    private static void test2(){
        for(int i=1;i<=9;i++){
            for(int j=i;j<9;j++){
                System.out.print("\t");
            }
            for(int j=i;j>0;j--)
            {
                if((i*j)<10)
                    System.out.print(" "+j+"*"+i+"="+(i*j)+"\t");
                else
                    System.out.print(" "+j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    private static void test1(){

        for(int i=9;i>0;i--){
            for(int j=0;j<9-i;j++){
                System.out.print("\t");
            }
            for(int j=i;j>0;j--){
                if((i*j)<10)
                    System.out.print(" "+j+"*"+i+"="+(i*j)+"\t");
                else
                    System.out.print(+j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}

