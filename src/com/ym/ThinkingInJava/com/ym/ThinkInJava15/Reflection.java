package com.ym.ThinkingInJava.com.ym.ThinkInJava15;

import sun.misc.OSEnvironment;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

public class Reflection {
    public static Set<String> analyze(Class<?> enumClass) {
        System.out.println("Interfaces: ");
        for (Type type : enumClass.getGenericInterfaces())
            System.out.println(type);
        System.out.println("Base: " + enumClass.getSuperclass());
        System.out.println("Method: ");
        Set<String> methods = new TreeSet<String>();
        for (Method m : enumClass.getMethods())
            methods.add(m.getName());
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        System.out.println("Explore.containsAll(Enum)? "+enumMethods.containsAll(enumMethods));
        System.out.println("Explore.removeAll(Enum): ");
        exploreMethods.removeAll(enumMethods);
        System.out.println(exploreMethods);

    }
}
