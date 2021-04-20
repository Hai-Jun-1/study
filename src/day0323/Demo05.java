package day0323;

public class Demo05 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("好好学习forwhile,第"+i+"次；");
            int j = 0;
            while (j<=i) {
                System.out.print("好好学习while,第"+j+"次；");
                j++;
                int k = 0;
                do {
                    System.out.print("好好学习dowhile,第"+k+"次；");
                    k++;

                } while (k <= j);
            }
        }
    }
}

