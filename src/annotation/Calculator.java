package annotation;
@CheckError
public class Calculator {
    //加法
    @CheckError()
    public  int add(int x,int y){
        return x+y;
    }

    //除法
    @CheckError
    public  int  divider(int x,int y){
        return x/y;
    }

    //减法
    public  int  sub(int x,int y){
        return x-y;
    }
}
