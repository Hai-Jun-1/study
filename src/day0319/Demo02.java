package day0319;

public class Demo02 {
    public static void main(String[] args) {
        Students s1= new Students();
        /*double source = 78.5;
        String name ="张三";
        String sex = "男";
        输出结果：Java的最高分0.0,姓名是null,性别是null
        */
        s1.method();
    }
}
class Students{
    double source = 78.5;
    String name ="张三";
    String sex = "男";
    public Students() {
    }

    public Students(double source, String name, String sex) {
        this.source = source;
        this.name = name;
        this.sex = sex;
    }
    public void method(){
        /*double source = 78.5;
        String name ="张三";
        String sex = "男";

        */
        System.out.println("Java的最高分"+this.source+",姓名是"+this.name+",性别是"+this.sex);
    }
}
