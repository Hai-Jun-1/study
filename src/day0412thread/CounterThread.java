package day0412thread;

public class CounterThread extends Thread{
    public ThreadBank bank;
    public CounterThread(ThreadBank inBank){
        this.bank =inBank;
    }
    public void run(){
        //判断银行里边的钱是不是有余额，可以取
        while(true){
            if (!bank.takeMoney(100.00,"柜台")) {
                break;
            }
        }
    }
}
