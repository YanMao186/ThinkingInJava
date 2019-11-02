package com.ym.ThinkingInJava.com.ym.ThinkInJava15;

public enum OzWitch {
    WEST("Miss Gulch,aka the Wicked Witch of the West"),
    NORTH("Glinda, the good witch of the north"),
    EAST("Wicked Witch of the East.wearer of the Ruby"+"Slippers,crushed by Dorothy`s house"),
    SOUTH("Good by inference,but missing"); //结尾必须是；
    private String description;

    OzWitch(String description) {
        //必须添加有参构造否则会报错
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values()) {
            System.out.println(witch+": "+witch.getDescription());
        }
    }
}
