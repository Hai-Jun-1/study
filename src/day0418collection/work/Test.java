package day0418collection.work;

import day0416collection.News;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("共有数据——" + DemoLinkedList.eCalendar.size());
        DemoLinkedList nList;
        for (int i = 0; i < DemoLinkedList.eCalendar.size(); i++) {
            nList = DemoLinkedList.eCalendar.get(i);
            System.out.println("名字：" + nList.getName() + "金额：" + nList.getMoney());
            ;
        }
        List<DemoLinkedList> changeList = getNewList(DemoLinkedList.eCalendar);
        for (DemoLinkedList person:changeList
             ) {
            if (person!=null){
                System.out.println(person.toString());
            }

        }
    }

    private static List<DemoLinkedList> getNewList(List<DemoLinkedList> list) {
        HashMap<String, DemoLinkedList> tempMap = new HashMap<>();
        for (DemoLinkedList a :
                list) {
            int acount = 0;
            //获取姓名
            String temp = a.getName();
            if (tempMap.containsKey(temp)) {//判断Map集合中是否有相同的键值
                DemoLinkedList d = new DemoLinkedList();
                d.setName(temp);//
                d.getMoney();
                acount++;
                tempMap.put(temp, d);
            } else {
                tempMap.put(temp, a);
            } System.out.println(acount);
        }
        List<DemoLinkedList> newList =new ArrayList<>();
        for (String temp:tempMap.keySet()) {
            newList.add(tempMap.get(temp));
        }
        return newList;
    }
}
