package com.swingy.model;

public enum HeroType {
    KNIGHT(1, "Knight"),
    HUNTER(2, "Hunter"),
    PRINCESS(3, "Princess"),
    ARCHER(4, "Archer");

    private final int id;
    private final String name;

    HeroType(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
