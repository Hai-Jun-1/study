package day0329;

public class Demo03 {
    public static void main(String[] args) {
        int[] arr = new int[]{160, 30, 40, 19, 100, 82, 63, 99, 85, 60};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int temp;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+"\t");
        }

    }
}
