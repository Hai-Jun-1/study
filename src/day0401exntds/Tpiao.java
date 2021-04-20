package day0401exntds;
/*选民类
 */
public class Tpiao {
    String name;
    static int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Tpiao.id = id;
    }
}
