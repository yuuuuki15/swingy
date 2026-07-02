package com.swingy.model;

public enum ArtifactType {
    WEAPON(1, "Weapon"),
    ARMOR(2, "Armor"),
    HELM(3, "Helm");

    private final int id;
    private final String type;

    private ArtifactType(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
