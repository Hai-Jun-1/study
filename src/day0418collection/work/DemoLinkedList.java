package day0418collection.work;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    private String name;
    private long money;
    static List<DemoLinkedList> eCalendar = new ArrayList<>();

    static {
        DemoLinkedList p1 = new DemoLinkedList();
        p1.name = "张三";
        p1.money = 6;
        DemoLinkedList p2 = new DemoLinkedList();
        p2.name = "张三";
        p2.money = 66;
        DemoLinkedList p3 = new DemoLinkedList();
        p3.name = "张三";
        p3.money = 6666;
        DemoLinkedList p4 = new DemoLinkedList();
        p4.name = "李四";
        p4.money = 66666;
        DemoLinkedList p5 = new DemoLinkedList();
        p5.name = "李四";
        p5.money = 1;
        eCalendar.add(p1);
        eCalendar.add(p2);
        eCalendar.add(p3);
        eCalendar.add(p4);
        eCalendar.add(p5);
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
