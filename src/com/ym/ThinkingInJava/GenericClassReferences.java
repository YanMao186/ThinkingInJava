package com.ym.ThinkingInJava;

public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
        System.out.println(Integer.MAX_VALUE);
    }
}
