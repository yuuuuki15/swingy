package com.swingy.model;

public class Armor extends Artifact{

    public Armor(String name, int increaseDefense) {
        super(ArtifactType.ARMOR, name, 0, increaseDefense, 0);
    }

}
