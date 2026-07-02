package com.swingy.model;

public class Weapon extends Artifact {

    public Weapon(String name, int increaseAttack) {
        super(ArtifactType.WEAPON, name, increaseAttack, 0, 0);
    }

}
