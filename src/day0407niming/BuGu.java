package day0407niming;

public class BuGu  {


    public static void main(String[] args) {
        Function x =new Function(){
            @Override
            public void cry() {

            }

            @Override
            public void fly() {

            }

            @Override
            public void music() {
                System.out.println("大风吹");
            }
        };
        x.music();
    }
}
