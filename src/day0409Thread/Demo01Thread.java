package day0409Thread;

public class Demo01Thread extends  Thread implements Runnable{
    public Demo01Thread(String name) {
        super(name);
    }

    public  void run(){
        for (int i = 0; i <50 ; i++) {
            System.out.println("循环执行第："+i+"次，name:"+getName()+",id"+getId()+"");
        }
    }
    Runnable runnable =new Runnable() {
        @Override
        public void run() {
            for (int i = 50; i <100 ; i++) {
                System.out.println("循环执行第："+i+"次，name:"+getName()+",id"+getId()+"");
            }
        }
    };

}
