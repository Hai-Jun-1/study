package day0409Thread;

public class Demo02Runnable implements Runnable {
    String name;
    public Demo02Runnable(String name) {
        this.name =name;
    }
    @Override
    public void run() {
        for (int i = 50; i <100 ; i++) {
            if (i%2==0){
                System.out.println("我是Demo02Runnable中的线程:"+this.name+"循环"+i+"次");
            }
        }
    }
}
