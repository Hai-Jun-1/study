package day0412thread;

import com.sun.deploy.security.ruleset.ExceptionRule;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadChi {
    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable1" + Thread.currentThread().getName());
            }
        };


        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable2" + Thread.currentThread().getName());
            }
        };
//        ExecutorService service =new Executors.newFixedThreadPool("2");
    }
}

