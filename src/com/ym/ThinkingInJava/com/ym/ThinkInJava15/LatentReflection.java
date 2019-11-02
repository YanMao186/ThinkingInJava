package com.ym.ThinkingInJava.com.ym.ThinkInJava15;

import sun.java2d.pipe.SpanIterator;

import java.awt.*;
import java.lang.reflect.Method;
import java.time.chrono.MinguoEra;

class Mime {
    public void walkAgainstTheWind() {}
    public void sit() {
        System.out.println("Pretending to sit");
    }
    public void pushInvisibleWalls() {}
    public String toString() {
        return "Mime";
    }
}
class SmartDog {
    public void speak() {
        System.out.println("Woof");
    }
    public void sit() {
        System.out.println("Sitting");
    }
    public void reproduce() {}
}
class CommunicateReflectively {
    public static void perform(Object speaker) {
        Class<?> spkr = speaker.getClass();
        try {
            try {
                Method speak = spkr.getMethod("speak");
                speak.invoke(speaker);
            }catch (NoSuchMethodException e) {
                System.out.println(speaker+"cannot speak");
            }
            try {
                Method sit = spkr.getMethod("sit");
                sit.invoke(speaker);
            }catch (NoSuchMethodException e) {
                System.out.println(speaker+"cannot sit");
            }
        }catch (Exception e) {
            throw new RuntimeException(speaker.toString(),e);
        }
    }
}
public class LatentReflection {
    public static void main(String[] args) {
        CommunicateReflectively.perform(new SmartDog());
//        CommunicateReflectively.perform(new Robot());
        CommunicateReflectively.perform(new Mime());
    }
}
