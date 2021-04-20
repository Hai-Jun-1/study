package day0323;

public class Demo03 {
    public static void main(String[] args) {
        int i= 1;
        while(i<=50){
            int a = 50-i;
            System.out.println("第几遍了，第"+i+"遍了"+",还剩"+a+"遍");
            i++;
            continue;

        }
    }
}
