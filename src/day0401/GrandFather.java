package day0401;

public class GrandFather {
    String name;
    String hobby;

    public GrandFather() {
        System.out.println("父类的构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
