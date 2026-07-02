package com.swingy.model;

public class Knight extends Hero {

    public Knight(String name) {
        super(name, HeroType.KNIGHT);
        this.setAttack(10);
        this.setDefense(10);
        this.setHitPoint(10);
    }

}
