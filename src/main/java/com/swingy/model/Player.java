package com.swingy.model;

import java.util.ArrayList;
import java.util.List;


public class Player {
    private final List<Hero> heroArray = new ArrayList<>();

    public void addHero(Hero hero) {
        heroArray.add(hero);
    }

    public void removeHero(Hero hero) {
        heroArray.remove(hero);
    }

    public List<Hero> getHeroArray() {
        return heroArray;
    }
}
