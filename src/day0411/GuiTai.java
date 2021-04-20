package day0411;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GuiTai extends BigBank implements Runnable{

    public GuiTai(String name) {
        super(name);
    }

    @Override
    public void run() {
        Lock lock = new ReentrantLock();
        while (true) {
            lock.lock();
            if (!methodQu2()) {
                break;
            }
            lock.unlock();
        }

    }
    public synchronized static boolean methodQu2() {
        if (money > 0) {
            //可以继续取
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
