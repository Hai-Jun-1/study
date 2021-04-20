package day0409Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 取钱
 * 每次100，两个线程（两个人一起取），总额3000，
 * 创建线程，匿名内部类的接口实现，Runnable，传入对象，
 * 判断;金额从3000递减100至0。
 */
public class Demo05Synchronized extends Thread {
    static double money = 1000.00;
    public static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            if (!methodQu2()) {
                break;
            }
        }
    }

    public Demo05Synchronized(String name) {
        super(name);
    }

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            Lock lock = new ReentrantLock();
            Object o = new Object();

            @Override
            public void run() {
                while (true) {
                    lock.lock();
                    if (!methodQu()) {

                        break;
                    }
                    lock.unlock();
                }
            }
        };
        Demo05Synchronized thread = new Demo05Synchronized("wait，等待线程ATM取钱");//继承创建的线程
        thread.start();
        Thread bThread = new Thread(runnable, "唤醒线程，柜台取钱");//接口创建的线程
        bThread.start();
    }

    /**
     * 需求，金额递减100，从3000递减0 .开始取钱
     *
     * @return,返回值为true：
     */
    public static boolean methodQu() {
        synchronized (obj) {
            if (money > 0) {
                //可以继续取
                try {
                    System.out.println("我要休息1秒继续运行");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //唤醒等待
                System.out.println("调用notify方法，释放锁对象，并且唤醒wait状态的线程");
                //获取当前线程对象的名字
                String name = Thread.currentThread().getName();
                System.out.println(name + "取出100，还剩金额为:" + (money -= 100.00));
                obj.notify();
                return true;
            } else {
                System.out.println("钱已经取光，请充钱！");
                return false;
            }
        }
    }


    public static boolean methodQu2() {
//等待线程
        synchronized (obj) {
            if (money > 0) {
                //可以继续取
                try {
//                    Thread.sleep(200);
                    System.out.println("等待线程，一会记得唤醒我");
                    obj.wait();//无限等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait醒来。拿回来我的锁对象，继续执行");
                //获取当前线程对象的名字
                String name = Thread.currentThread().getName();
                System.out.println(name + "取出200，还剩金额变为:" + (money -= 200.00));
                return true;
            } else {
                System.out.println("钱已经取光，请充钱！");
                return false;
            }
        }


    }
}