package day0406interface;

public class SecurityDoor extends Door implements Lock,Photo{
    @Override
    void open() {
        System.out.println("开门");
    }

    @Override
    void close() {
        System.out.println("关门");
    }

    @Override
    public void openDoor() {
        System.out.println("开锁");
    }

    @Override
    public void closeDoor() {
        System.out.println("关锁");
    }

    @Override
    public void takePhoto() {
        System.out.println("拍照");
    }
}
