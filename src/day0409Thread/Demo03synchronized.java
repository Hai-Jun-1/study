package day0409Thread;

public class Demo03synchronized {
    public static void main(String[] args) {
        Runnable runnable =new Runnable() {
            Object o=new Object();

            int ticket =20;

            @Override
            public void run() {
                System.out.println();
            }
        };
    }
}
