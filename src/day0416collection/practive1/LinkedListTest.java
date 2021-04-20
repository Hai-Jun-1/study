package day0416collection.practive1;

import day0416collection.News;
import org.w3c.dom.ls.LSException;

import java.util.List;

/**
 * 添加头条
 */
public class LinkedListTest {
    public static void main(String[] args) {
        Newss n=new Newss();
        n.id=0;
        n.title ="海鲜";
        n.author="果果";
        n.name="果";
        //插入下标注为0位置
//        Newss.newslist.add(0,n);
        Newss.newslist.addFirst(n);
        System.out.println("获取到的第一条新闻是："+Newss.newslist.getFirst().getTitle());

        System.out.println("获取到最后一条新闻是："+Newss.newslist.getLast().getTitle());

        //删除最后一条
        Newss.newslist.removeLast();

    }
}
