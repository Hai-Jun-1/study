package day0416collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Id
 */
public class News {
    int id;
    String title;
    /**
     * 编辑
     */
    String name;
    String author;
    static List<News> newslist=new ArrayList<News>();
    static {
        News n1=new News();
        n1.id =1;
        n1.title= "接种疫苗";
        n1.author="紫薇";
        n1.name="万紫薇";
        News n2=new News();
        n2.id =2;
        n2.title="投入最新疫苗3针";
        n2.author="王欣如";
        n2.name="欣如";
        News n3=new News();
        n3.id =3;
        n3.title="戏剧";
        n3.author="欣";
        n3.name="二哈";
        newslist.add(n1);
        newslist.add(n2);
        newslist.add(n3);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
