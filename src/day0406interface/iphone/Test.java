package day0406interface.iphone;

public class Test {
    public static void main(String[] args) {
        int a =1;
        int b=2;
        int c=3;

        int max =(a>b?a:b);
        int maxz =(c>max?c:max);

        NewIPhone cell=new NewIPhone();
        IPhone cellOld=cell;


        cellOld.kind();
        cellOld.call();
        cellOld.note();

        cell.kindNew();
        cell.web();
        cell.see();
        cell.tablePhoto();
        cell.call();
        cell.note();

    }
}
