package com.ym.ThinkingInJava.com.ym.ThinkInJava15;

public enum SpaceShip {
    SCOUT,CARGO,TRANSPORT,CRUISER,BATTLESHIP,MOTHERSHIP;

    @Override
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0)+lower;
    }

    public static void main(String[] args) {
        for (SpaceShip name : values()) {
            System.out.println(name);
        }
    }
}
