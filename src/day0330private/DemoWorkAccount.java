package day0330private;

public class DemoWorkAccount {
    private int date;
    private int money;


    public int getDate() {
        return date;
    }

    /* public void setDate(int date) {
         for (; date < 31; date++) {
             if (date % 5 == 0) {
                 this.date = date;
                 if (date == 5) {
                     System.out.print("日期：03.0" + this.date + "号存钱，" + "\t\t");
                 } else {
                     System.out.print("日期：03." + this.date + "号存钱，" + "\t\t");
                 }
                 setMoney(0);
             }
         }*/
    public void setDate(int date) {
        int sum=0;
        for (; date < 31; date += 5) {
            this.date = date;
            if (date < 10) {
                System.out.print("仙女在日期为：03.0" + this.date + "号存钱，" + "\t\t");
            } else {
                System.out.print("仙女在日期为：03." + this.date + "号存钱，" + "\t\t");
            }
            setMoney(0);
            System.out.print("金额为：" + this.money + "\n");

            sum+=this.money;
        }
        System.out.println("仙女在当月存钱的总金额是："+sum+"，恭喜荣升“财富达人”");
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = (this.date) * 200;


    }
}
