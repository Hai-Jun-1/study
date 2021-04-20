package day0331static.uncle;

public class Uncle {
    public String name;
    public static String uncleHobby;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getUncleHobby() {
        return uncleHobby;
    }

    public static void setUncleHobby(String uncleHobby) {
        Uncle.uncleHobby = uncleHobby;
    }
}
