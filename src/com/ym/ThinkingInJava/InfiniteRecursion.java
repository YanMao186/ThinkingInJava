package com.ym.ThinkingInJava;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    public String toString() {
        return "InfiniteRecursion address:" + super.toString();
    }
    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
            System.out.printf(v.toString());
            System.out.format(v.toString(),1,1);
        }
    }
}
