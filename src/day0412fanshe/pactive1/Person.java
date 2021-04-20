package day0412fanshe.pactive1;

public class Person {
    String name;
    long mobile;
    String sex;
    static Person[] arr=new Person[5];
    static {
        Person p0 = new Person();
        p0.name = "姓名";
        p0.mobile = 0;
        p0.sex = "性别";
        Person p1 = new Person();
        p1.name = "二哈";
        p1.mobile = 1666;
        p1.sex = "男";
        Person p2 = new Person();
        p2.name = "三哈";
        p2.mobile = 1777;
        p2.sex = "男";
        Person p3 = new Person();
        p3.name = "四哈";
        p3.mobile = 1888;
        p3.sex = "男";
        Person p4 = new Person();
        p4.name = "五哈";
        p4.mobile = 1999;
        p4.sex = "男";
        arr[0] = p0;
        arr[1] = p1;
        arr[2] = p2;
        arr[3] = p3;
        arr[4] = p4;
    }


    public  void method(){
        /*Person[] arr = new Person[5];
        Person p0 = new Person();
        p0.name = "姓名";
        p0.mobile = 0;
        p0.sex = "性别";
        Person p1 = new Person();
        p1.name = "二哈";
        p1.mobile = 1666;
        p1.sex = "男";
        Person p2 = new Person();
        p2.name = "三哈";
        p2.mobile = 1777;
        p2.sex = "男";
        Person p3 = new Person();
        p3.name = "四哈";
        p3.mobile = 1888;
        p3.sex = "男";
        Person p4 = new Person();
        p4.name = "五哈";
        p4.mobile = 1999;
        p4.sex = "男";
        arr[0] = p0;
        arr[1] = p1;
        arr[2] = p2;
        arr[3] = p3;
        arr[4] = p4;*/
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public Person[] getArr() {
        return arr;
    }

    public  void setArr(Person[] arr) {
        this.arr = arr;
    }

//    public static Person[] getArr() {
//        return arr;
//    }
//
//    public static void setArr(Person[] arr) {
//        Person.arr = arr;
//    }
}
