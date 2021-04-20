package day0406interface.graphics;

public abstract class Graphics {
    double chang;
    double kuan;
    double banjing;
    double area;
    final Double PI=3.14;
    public final double area(Graphics graphics){
        if ( graphics instanceof Rectangle ){
            graphics.area=graphics.chang*graphics.kuan;
            System.out.println("长方形的面积是"+graphics.area);

        }else if ( graphics instanceof Circular){
            graphics.area=graphics.PI*graphics.banjing*graphics.banjing;
            System.out.println("圆形的面积是；"+graphics.area);
        }
        return graphics.area;
    }
}
