package day0418collection.work1;


import java.util.ArrayList;
import java.util.List;

public class DateCol {
    private String name;
    private long money;
    static List<DateCol> d = new ArrayList<>();
    static {
        DateCol p1 = new DateCol();
        p1.name = "张三";
        p1.money = 6;
        DateCol p2 = new DateCol();
        p2.name = "张三";
        p2.money = 66;
        DateCol p3 = new DateCol();
        p3.name = "张三";
        p3.money = 6666;
        DateCol p4 = new DateCol();
        p4.name = "李四";
        p4.money = 66666;
        DateCol p5 = new DateCol();
        p5.name = "李四";
        p5.money = 1;
        d.add(p1);
        d.add(p2);
        d.add(p3);
        d.add(p4);
        d.add(p5);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
}
