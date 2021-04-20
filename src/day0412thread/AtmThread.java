package day0412thread;

/**
 * 从ATM机取款
 */
public class AtmThread extends Thread{
    public ThreadBank bank;
    public AtmThread(ThreadBank inBank){
        this.bank =inBank;
    }
    public void run(){
        //判断银行里边的钱是不是有余额，可以取
        while(true){
            if (!bank.takeMoney("ATM",100)) {
                break;
            }
        }
    }
}
