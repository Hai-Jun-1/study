package day0406demo;

public class Test {
    public static void main(String[] args) {
        IntelCPU CPU = new IntelCPU();
        JSD_EMS EMS = new JSD_EMS();
        XJ_HardDisk hardDisk = new XJ_HardDisk();
        CPU.setCPUBrand("神州");
        CPU.setCPUFrequency(4);
        EMS.setEMSType("爱国者");
        EMS.setEMSSize(16);
        hardDisk.setCapacity(10000);
//        System.out.println("计算机的信息如下：");
//        System.out.println("CPU的品牌是："+CPU.getCPUBrand()+",主频是;"+CPU.getFrequency()+"GHz");
//        System.out.println("内存类型："+EMS.getEMSType()+",内存容量是："+EMS.getSize()+"GB");
//        System.out.println("硬盘的容量是："+hardDisk.getCapacity()+"GB");
        Integer a= new Integer(100);
        //自动装
//        int y =a;
//        手动装
        int y =a.intValue();
        System.out.println(y);
    }


}
