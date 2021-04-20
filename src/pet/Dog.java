package pet;



public class Dog extends Pet {
    String food1 ="骨头";
    String food2 ="狗粮";
    String[]foods={"骨头","狗粮"};
    public void eat(String food){
        System.out.println(name+sex+"吃"+food);
    }
}
