package com.ym.ThinkingInJava.com.ym.ThinkInJava15;

public class Demo1 {
   static boolean  b;
        public Boolean isFalse(){
            return b;
        }
    public static void main(String[] args) {
       Demo1 demo1 = new Demo1();
        Boolean aFalse = demo1.isFalse();
        System.out.println(aFalse);
    }
}
