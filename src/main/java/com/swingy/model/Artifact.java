package com.swingy.model;

public abstract class Artifact {
    private final ArtifactType type;
    private final String name;
    private final int increaseAttack;
    private final int increaseDefense;
    private final int increaseHitPoint;

    public Artifact(ArtifactType type, String name, int increaseAttack, int increaseDefense, int increaseHitPoint) {
        this.type = type;
        this.name = name;
        this.increaseAttack = increaseAttack;
        this.increaseDefense = increaseDefense;
        this.increaseHitPoint = increaseHitPoint;
    }

    public ArtifactType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getIncreaseAttack() {
        return increaseAttack;
    }

    public int getIncreaseDefense() {
        return increaseDefense;
    }

    public int getIncreaseHitPoint() {
        return increaseHitPoint;
    }
}
