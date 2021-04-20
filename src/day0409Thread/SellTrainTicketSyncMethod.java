package day0409Thread;

import javax.sound.sampled.FloatControl;

public class SellTrainTicketSyncMethod {
    static int  ticket = 20;

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //窗口 永远开启
                while (true) {
                    if(!sellTicket()){
                        break;
                    };
                }
            }
        };
        Thread sellWin1 = new Thread(runnable,"窗口1");
        sellWin1.start();
        Thread sellWin2 = new Thread(runnable,"窗口2");
        sellWin2.start();
        Thread sellWin3 = new Thread(runnable,"窗口3");
        sellWin3.start();
        System.out.println("售票完毕！");
    }

    private synchronized static boolean sellTicket() {
        if (ticket > 0) {//有票 可以卖
            //出票操作
            //使用sleep模拟一下出票时间
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //获取当前线程对象的名字
            String name = Thread.currentThread().getName();
            System.out.println(name + "正在卖:" + ticket--);
            return true;
        } else {
            System.out.println("票已售罄，请等待下一个开放时间窗！");
            return false;
        }
    }


}
