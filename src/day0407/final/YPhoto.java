public final class YPhoto extends  Photo{

    int r;
    double area;
    @Override
    public final void methodY() {
        super.methodC();
        this.r=3;
        area =Math.PI*(r*r);
        System.out.println("圆形面积为："+area);
    }
}
