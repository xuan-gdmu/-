package com.atguigu.demo;

import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Scanner;

public class MyTest implements Runnable{
    private static volatile int a = 0;
    public static void main(String args[]) throws InterruptedException {
//       String next;
//       Scanner scanner = new Scanner(System.in);
//
//       while (scanner.hasNext()){
//           next = scanner.nextLine();
//           String[] s = next.split(" ");
//           int i = Integer.parseInt(s[0]);
//           int j = Integer.parseInt(s[1]);
//
//           System.out.println();
//       }
        MyTest thread = new MyTest();
        Thread thread1 = new Thread(thread);
        Thread thread2 = new Thread(thread);
        thread1.start();
        thread2.start();
        Thread.sleep(5000);
        System.out.println(a);
    }

    @Override
    public void run() {
        synchronized (this){
            for (int i = 0;i < 100000;i++){
                a++;
            }
            System.out.println(a);
        }

    }
//    private static String  isFlag(int start,int end){
//       int sum = 0;
//       boolean flag = false;
//       for(int k = start; k <= end;k++){
//           sum = 0;
//           while (k>0){
//               sum += Math.pow(k%10,3);
//               k/=10;
//           }
//           if(sum == k) {
//               flag = true;
//               return Integer.toString(sum);
//           }
//       }
//       if (flag){
//           return null;
//       }
//
//    }
}
