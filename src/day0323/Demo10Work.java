package day0323;
/*
* 1、数据类型
*   基本数据类型：字符型 char，2个字节，范围;0-65535
*              字节型 byte，1个字节，范围:-128-127
*              短整型 short，2个字节，范围:-32768-32767
*              整型 int ，4个字节，范围:2的-231次方——-2的31次方-1
*              长整型 long，8个字节，范围：-2的63次方——2的633次方-1
*              单精度浮点数 float，4个字节，范围：1.4013E-45-3.4028E+38
*              双精度浮点数 double，8个字节，范围：4.9E+3.24——1.7977E+308
*              布尔类型 boolean，1个字节，范围，true，false
*   引用数据类型：String字符串，类，接口
* 2、条件判断语句
*       if(布尔表达式1){
*           //符合判断表达式1为true进入此方法体1
*           方法体1
*       }else if(布尔表达式2){
*           //符合判断表达式2为true进入此方法体1
*            方法体2;
*       }else{
*           //不符合任何判断表达式为false进入此方法体3
*           方法体3;
*       }
*
*       switch(表达式){
*           case 1:{
*               方法体1;
*               break;
*           }
*           case 2:
*               方法体2;
*               break;
*           }
*           default:{
*                  //不满足选择条件，执行此方法体
*                  方法体，用做警告
*           }
* 3、循环语句
*   用来控制循环语句的语法
*       ①continue，跳出当前循环，执行下一次循环语句
*       ②break，结束当前循环，执行循环以下的语句
*   for(①初始化变量;②布尔表达式;递增){
*       方法体;
*   }
*   while(布尔表达式){
*       方法体;
*   }
*
*   //注意：特殊点，会不受任何控制，先执行一次循环体
*   do{
*       方法体;
*   }while(布尔表达式)
*
* */
public class Demo10Work {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        for (; i <= 10; i++) {
            sum += i;
            if (sum>=20){
                break;
            }
        }
        System.out.println("1-10之间，求和累加的数字是："+i);

        //Demo02
        int sum1 =0;
        for (int j = 1; j <=10 ; j++) {
            if (j%2==0){
                System.out.println(j+"：是偶数");
                sum1+=j;
            }else{
                System.out.println(j+"：不是偶数");
                continue;
            }
        }
        System.out.println("1-10的所有偶数之和为"+sum1);
    }
    
    
}
