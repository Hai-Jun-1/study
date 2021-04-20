package day0416collection;

import day0416collection.pracite.Dog;

public class NewsShow {
    public static void main(String[] args) {
        System.out.println("共有新闻——"+News.newslist.size());
        News news ;
        for (int i=0;i<News.newslist.size();i++) {
            news =News.newslist.get(i);
            System.out.println("第"+news.getId() +"条"+news.getTitle());;
        }
        News n=new News();
        n.title="1";
        //判断列表中是否存在此对象，其实判断的是地址。必须通过add添加进去
        System.out.println(News.newslist.contains(n));//false


        News.newslist.add(n);
        System.out.println(News.newslist.contains(n));//true
        News.newslist.remove(n);
    }
}
