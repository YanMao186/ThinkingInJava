package com.ym.ThinkingInJava;

import java.util.EnumSet;

public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoits> poits = EnumSet.noneOf(AlarmPoits.class);
        poits.add(AlarmPoits.BATHROOM);
        System.out.println(poits);
        poits.addAll(EnumSet.of(AlarmPoits.STAIR1,AlarmPoits.STAIR2,AlarmPoits.KITCHEN));
        System.out.println(poits);
        poits = EnumSet.allOf(AlarmPoits.class);
        poits.removeAll(EnumSet.of(AlarmPoits.STAIR1,AlarmPoits.STAIR2,AlarmPoits.KITCHEN));
        System.out.println(poits);
        poits.removeAll(EnumSet.range(AlarmPoits.OFFICE1,AlarmPoits.OFFICE2));
        System.out.println(poits);
        poits = EnumSet.complementOf(poits);
        System.out.println(poits);
    }
}
