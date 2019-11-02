package com.ym.ThinkingInJava;

import java.util.EnumMap;
import java.util.Map;

interface Command {
    void action();
}
public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoits,Command> em = new EnumMap<AlarmPoits, Command>(AlarmPoits.class);
        em.put(AlarmPoits.KITCHEN,new Command(){
            public void action() {
                System.out.println("Kitchen fire");
            }
        });
        em.put(AlarmPoits.BATHROOM,new Command(){
            @Override
            public void action() {
                System.out.println("Bathroom alert");
            }
        });
        for (Map.Entry<AlarmPoits, Command> e : em.entrySet()) {
            System.out.println(e.getKey()+": ");
            e.getValue().action();
        }
        try {
        em.get(AlarmPoits.UTILITY).action();

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
