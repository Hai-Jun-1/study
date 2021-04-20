package day0412threadwait.workthread;


public class ThreadDemo extends Thread {
    static int rood1=0;
    static int rood2=0;

    final double runRood = 250;
    public static ThreadDemo dy = new ThreadDemo();
    static String[] arr1 = new String[]{"北小明", "北小红", "北小亮", "北小强"};
    static String[] arr2 = new String[]{"南小明", "南小红", "南小亮", "南小强"};

    public ThreadDemo() {
    }

    public ThreadDemo(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        while (true){
            rood1 += 250;
            if (!dy.method1(rood1,arr1)) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true){
                    rood2 +=250;
                    if (!dy.method1(rood2,arr2)) {
                        break;
                    }
                }
            }
        };
        ThreadDemo threadDemo = new ThreadDemo("北大");
        threadDemo.start();
        Thread thread = new Thread(runnable, "南大");
        thread.start();
    }
    public boolean method1(int rood,String[] arr) {
        int a = -1;
        if (rood <= 1000) {
            try {
                String name = Thread.currentThread().getName();
                a++;
                System.out.println("组名:" + name + "，姓名" + arr[a] + "，跑了:" + runRood);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        } else {
            System.out.println("到达终点，比赛结束");
            return false;
        }
    }

   /* public  boolean method2() {
        int a=-1;
        String[] arr = new String[]{"南小明", "南小红", "南小亮", "南小强"};
        if (rood2 < 1000) {
            try {
                rood2 += 250;
            } catch (Exception e) {
                e.printStackTrace();
            }
            String name = Thread.currentThread().getName();
            a++;
            System.out.println("组名" + name + "，姓名" + arr[a] + "，跑了:" + runRood);
            return true;
        } else {
            System.out.println("到达终点，比赛结束");
            return false;
        }
    }*/
}
