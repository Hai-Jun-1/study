package day0419Irerator;

import annotation.Person;
import day0418collection.work1.DateCol;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01Irerator {
    public static void main(String[] args) {
        //HashSet实现Set接口
        Set newList =new HashSet();
        DateCol dateCol =new DateCol();
        dateCol.setName("蜡笔小新");
        newList.add(dateCol);
        DateCol dateCol1 =new DateCol();
        dateCol1.setName("机器猫");
        newList.add(dateCol1);
        DateCol d;
        Iterator<DateCol> iterator=newList.iterator();
        while(iterator.hasNext()){
            d=iterator.next();
            System.out.println("姓名："+d.getName());
        }
    }
}
