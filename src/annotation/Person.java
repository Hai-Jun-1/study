package annotation;

/**
 * 一个人的类
 */
@HelloAnnotation(name="aaa",sex="1",value="1")
public class Person {
    @Deprecated
    String name;

    String sex;

    double height;

    /**
     * 返回姓名
     * @return，Stirng类型
     */
    String getName(){
        return  this.name;
    }
    /*//报错的原因，如果一个注解有属性值，则必须给属性赋值
    @HelloAnnotation()
    public void doSome(){}
    //正确
    @HelloAnnotation(name="z",sex = "s",value = "1")
    public void dosSome(){}*/
}
