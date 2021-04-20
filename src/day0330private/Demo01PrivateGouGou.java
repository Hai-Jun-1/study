package day0330private;

/*
宠物管理系统
 */
public class Demo01PrivateGouGou {
    /**
     * 1-20之间
     */
    private int age;
    /**
     * 1、公仔
     * 2、母妹
     */
    private String sex;
    /**
     * name；
     */
    private String name;
    /**
     * 健康值;(1~100)
     */
    private int health;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age <= 20 && age > 0) {
            this.age = age;
        } else {
            this.age = 1;
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if ("1".equals(sex)) {
            this.sex = "公仔";
        }
        if ("2".equals(sex)) {
            this.sex = "仙女";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health <= 100 && health > 0) {
            this.health = health;
        } else {
            this.health = 60;
        }

    }

    public static void main(String[] args) {

    }
}
