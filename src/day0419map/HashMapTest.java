package day0419map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
//        HashMap
        Map <String,String> hashMap =new HashMap();
        hashMap.put("CN","中国");
        hashMap.put("US","美国");
        for (int i = 0; i <hashMap.size() ; i++) {
            System.out.println(hashMap.get(i));
        }
        System.out.println("***");
        for (String s:
                hashMap.keySet()) {//用了Set也是一个迭代器
            System.out.println(s);
        }
        for (String s:
                hashMap.values()) {
            System.out.println(s);
        }
        String s1;
        Iterator<String> iterator1 =hashMap.keySet().iterator();
        while(iterator1.hasNext()){
            s1=iterator1.next();
            System.out.println("key："+ s1);
        }
        String s2;
        Iterator<String> iterator2 =hashMap.values().iterator();
        while(iterator2.hasNext()){
            s2=iterator2.next();
            System.out.println("value："+ s2);
        }
        //判断是否存在值
        System.out.println(hashMap.containsKey("CN"));
        System.out.println(hashMap.containsValue("中国"));
    }
}
