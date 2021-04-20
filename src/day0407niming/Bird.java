package day0407niming;

public class Bird {
    void cry(){
        System.out.println("鸟可以叫");
    }
    void fly(){
        System.out.println("鸟可以飞");
    }
    void music(){
        System.out.println("鸟可以唱歌");
    }
    //布谷鸟,内部类
    static class Cuckoo extends Bird{
        @Override
        void music() {
            System.out.println("布谷");
        }
    }
//Test，匿名内部类
    public static void main(String[] args) {
        Bird x =new Cuckoo(){
            @Override
            void music() {
                System.out.println("布谷布谷");
            }
        };
        x.music();
    }
}
