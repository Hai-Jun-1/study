package day0406demo;

public class JSD_EMS implements EMS {
    String EMSType;
    int EMSSize;

    public void setEMSType(String EMSType) {
        this.EMSType = EMSType;
    }

    public void setEMSSize(int EMSSize) {
        this.EMSSize = EMSSize;
    }

    @Override
    public String getEMSType() {
        return EMSType;
    }

    @Override
    public int getSize() {
        return EMSSize;
    }
}
