package day0323;
/*
1-100,偶数之和

* */

public class Demo08For {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        for (; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("for循环，0-100所有偶数之和为：" + sum);

        //到这里的时候，已经i已经变成了100；
        int k = 0;
        int sum1 = 0;
        while (k % 2 == 0) {
            if (k <= 100) {
                sum1 += k;
                k += 2;
            } else {
                break;
            }
        }
        System.out.println("while循环，0-100所有偶数之和为：" + sum1);

        //到这里的时候，已经i已经变成了100；
        int j = 0;
        int sum2 = 0;
        do {
            if (j % 2 == 0) {
                j += 2;
                sum2 += j;
            }
        } while (j <= 98);
        System.out.println("do,while循环，0-100所有偶数之和为：" + sum2);
    }
}
