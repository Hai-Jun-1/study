package day0406demo;

public class IntelCPU implements CPU {
    String CPUBrand;
    double CPUFrequency;

    public void setCPUBrand(String brand) {
        this.CPUBrand = brand;
    }

    public void setCPUFrequency(double frequency) {
        this.CPUFrequency = frequency;
    }

    @Override
    public String getCPUBrand() {
        return CPUBrand;
    }

    @Override
    public double getFrequency() {
        return CPUFrequency;
    }
}
