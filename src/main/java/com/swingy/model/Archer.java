package com.swingy.model;

public class Archer extends Hero {

    public Archer(String name) {
        super(name, HeroType.ARCHER);
        this.setAttack(14);
        this.setDefense(8);
        this.setHitPoint(8);
    }

}
