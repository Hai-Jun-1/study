package annotation.practice;

public class Pr {
    public static void main(String[] args) {
        /*String s1="张三";
        String s2="abcd";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        *//*StringBuffer s=new StringBuffer(100);
        System.out.println();
        for (int i = 0; i < 3; i++) {
            s1="李武"+"sw";
            System.out.println(s1.hashCode());
        }
        for (int i = 0; i < 5; i++) {
            s1=s1+s2;
            System.out.println(s.append(i));
            System.out.println(s.hashCode());
            System.out.println(s1.hashCode());
            System.out.println();
        }*//*
        String s4=s2.replace("b","d");
        System.out.println(s4.hashCode());
        System.out.println(s2);
        String s3=s1.replaceAll("张","李");
        System.out.println(s1);*/
        int[] arr=new int[]{1,23,4,5};
        for (int i:
             arr) {
            System.out.println(i);

        }

    }
}
