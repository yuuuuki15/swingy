package com.swingy.model;

public class Hunter extends Hero {

    public Hunter(String name) {
        super(name, HeroType.HUNTER);
        this.setAttack(12);
        this.setDefense(8);
        this.setHitPoint(10);
    }

}
