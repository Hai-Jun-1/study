package day0419ma.mapprivacte;

import day0328work.Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo02Map {
    String name;
    String sex;

    public static void main(String[] args) {
        Demo02Map d1 = new Demo02Map();
        d1.name = "李明";
        d1.sex = "男";
        Demo02Map d2 = new Demo02Map();
        d2.name = "韩梅梅";
        d2.sex = "女";
        Demo02Map d3 = new Demo02Map();
        d3.name = "露西";
        d3.sex = "女";

        Map<String, Demo02Map> hashMap = new HashMap();
        hashMap.put("LiMi", d1);
        hashMap.put("HaiMeiMei", d2);
        hashMap.put("LuXi", d3);
        System.out.println(hashMap.get("HaiMeiMei").sex);

        
    }
}
