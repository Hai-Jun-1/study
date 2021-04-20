package day0412thread;

import java.util.function.DoubleBinaryOperator;

public class ThreadBank {
    Double money = 1000.00;
    public static Object obj = new Object();

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public  boolean takeMoney(double inMoney, String takeType) {
        synchronized (obj) {
            if (this.getMoney() - inMoney >= 0) {
                System.out.println("从" + takeType + "取款" + inMoney + "原金额为：" + this.getMoney()
                        + "取款后的余额：" + (this.getMoney() - inMoney));
//            System.out.println("从柜台取款100，原金额为：" + this.getMoney()
//                    + "取款后的余额：" + (this.getMoney() - 100));
                this.setMoney(this.getMoney() - inMoney);

                try {

                    System.out.println("wait，把锁的对象借你，记得唤醒我");
                    obj.wait();//无限等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return true;
            } else {
                return false;
            }
        }

    }

    public  boolean takeMoney(String takeType, double inMoney) {
        synchronized (obj){
            if (this.getMoney() - inMoney >= 0) {
                System.out.println("从" + takeType + "取款" + inMoney + "原金额为：" + this.getMoney()
                        + "取款后的余额：" + (this.getMoney() - inMoney));
//            System.out.println("从柜台取款100，原金额为：" + this.getMoney()
//                    + "取款后的余额：" + (this.getMoney() - 100));
                this.setMoney(this.getMoney() - inMoney);
                obj.notify();//唤醒等待
                try {
                    Thread.sleep(2000);
                    System.out.println("唤醒等待，wait的线程");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return true;
            } else {
                return false;
            }
        }

    }


}
