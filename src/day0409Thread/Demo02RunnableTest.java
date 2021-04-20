package day0409Thread;

public class Demo02RunnableTest {

    public static void main(String[] args) {
        Demo01Thread thread=new Demo01Thread("线程1");//新线程
        thread.start();


        Demo02Runnable a =new Demo02Runnable("接口实现线程");
        Thread thread1=new Thread(a,"柜台取钱");
        thread1.start();

//        int i =0;
//        while (i<1){
//            System.out.println("main线程循环执行第："+i+"次，id:"+i);
//            i++;
//        }

    }
}
