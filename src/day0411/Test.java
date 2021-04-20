package day0411;

import day0409Thread.Demo02Runnable;
import day0409Thread.Demo05Synchronized;

public class Test  extends Thread{
    @Override
    public void run() {
        super.run();
    }

    public static void main(String[] args) {
        BigBank.money =3000.00;
        BigBank a =new GuiTai("1");
//        a.currentThread().setName("GuiTai:");
        Thread thread2=new Thread(a,"柜台线程：");
        thread2.start();

        BigBank thread1 = new Atm("1");//继承创建的线程
        thread1.currentThread().setName("Atm:");
        thread1.start();

//        BigBank thread2 = new GuiTai("柜台取钱");//继承创建的线程
//        thread2.start();

    }
}





