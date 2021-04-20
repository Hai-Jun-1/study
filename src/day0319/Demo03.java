package day0319;

public class Demo03 {
    public static void main(String[] args) {
        Students1 s2= new Students1();
        /*double source = 78.5;
        String name ="张三";
        String sex = "男";
        输出结果：Java的最高分0.0,姓名是null,性别是null
        */
        s2.method();
    }
}
class Students1{
    String name ="张三";
    int age = 25;
    int wordyear = 3;
    int project = 5;
    String jsfx = "Java";
    String sexs = "篮球";
    public Students1() {
    }

    public Students1(String name, int age, int wordyear, int project, String jsfx, String sexs) {
        this.name = name;
        this.age = age;
        this.wordyear = wordyear;
        this.project = project;
        this.jsfx = jsfx;
        this.sexs = sexs;
    }

    public void method(){
        System.out.println("这个同学的姓名是"+this.name);
        System.out.println("年龄是"+this.age);
        System.out.println("工作了"+this.wordyear);
        System.out.println("做过项目数为"+this.project);
        System.out.println("技术方向是"+this.jsfx);
        System.out.println("兴趣爱好是"+this.sexs);
    }
}
