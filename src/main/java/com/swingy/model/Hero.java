package com.swingy.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.validation.constraints.*;

public abstract class Hero {

    @NotBlank(message = "Name is required")
    private String name;
    private HeroType type;
    private int level;
    private int experience;
    private float attack;
    private float defense;
    private float hitPoint;
    private final List<Artifact> artifactArray = new ArrayList<>();

    public Hero(String name, HeroType heroType) {
        this.name = name;
        this.type = heroType;
        this.level = 1;
        this.experience = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public float getAttack() {
        return attack;
    }

    public void setAttack(float attack) {
        this.attack = attack;
    }

    public float getDefense() {
        return defense;
    }

    public void setDefense(float defense) {
        this.defense = defense;
    }

    public float getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(float hitPoint) {
        this.hitPoint = hitPoint;
    }
}
