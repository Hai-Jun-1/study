package annotation;

public @interface HelloAnnotation {
    /**
     *我们通常在注解当中可以定义属性，以下这个是HelloAnnotation的name属性
     * 看着像一个方法，但实际上我们称为属性name
     * @return
     */
    String name ();
    String sex ();
    String value();
}
