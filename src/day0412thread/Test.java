package day0412thread;

public class Test {
    public  static void main(String[] args) {
        ThreadBank bank=new ThreadBank();
        AtmThread atm=new AtmThread(bank);
        atm.start();
        CounterThread gt=new CounterThread(bank);
        gt.start();
    }
}
