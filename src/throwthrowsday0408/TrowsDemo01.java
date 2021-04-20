package throwthrowsday0408;

import day0407niming.ExceptionTry;

public class TrowsDemo01 {
    int age;

    public void setAge (int age) throws Exception {
        System.out.println("年龄");
        if (age>100||age<0){
            throw new Exception();
        }else{
            System.out.println("输入合法");
            this.age =age;
        }

    }
    public int getAge() {
        return age;
    }
}

