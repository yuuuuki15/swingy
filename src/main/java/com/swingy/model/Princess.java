package com.swingy.model;

public class Princess extends Hero {

    public Princess(String name) {
        super(name, HeroType.PRINCESS);
        this.setAttack(8);
        this.setDefense(10);
        this.setHitPoint(12);
    }

}
