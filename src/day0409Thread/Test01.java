package day0409Thread;

public class Test01 {
    public static void main(String[] args) {
        Demo01Thread thread=new Demo01Thread("线程1");//新线程
        thread.run();

        Demo01Thread thread1=new Demo01Thread("线程2");//新线程
//        Runnable thread1=new Run("线程2");//新线程
        Thread thread2=new Thread(thread1);
        thread2.start();
//        thread1.start();
        for (int i = 0; i <1 ; i++) {
            if (i%2==0){
                System.out.println("main线程循环执行第："+i+"次，id:"+i);
            }
        }
    }
}
