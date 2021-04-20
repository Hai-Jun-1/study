package day0406demo;

public class XJ_HardDisk implements HardDisk{
    int Capacity;
    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return Capacity;
    }
}
