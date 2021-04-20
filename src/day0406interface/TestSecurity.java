package day0406interface;

public class TestSecurity {
    public static void main(String[] args) {
        SecurityDoor securityDoor =new SecurityDoor();
        securityDoor.takePhoto();
        securityDoor.openDoor();
        securityDoor.open();

        securityDoor.close();
        securityDoor.closeDoor();
    }
}
