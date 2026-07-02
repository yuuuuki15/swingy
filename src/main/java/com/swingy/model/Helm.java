package com.swingy.model;

public class Helm extends Artifact {

    public Helm(String name, int increaseHitPoint) {
        super(ArtifactType.HELM, name, 0, 0, increaseHitPoint);
    }

}
