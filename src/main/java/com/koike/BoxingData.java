package com.koike;

public class BoxingData {
    private final String name;
    private final String weight;

    private final Integer defense;

    public BoxingData(String name, String weight, Integer defense) {
        this.name = name;
        this.weight = weight;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public Integer getDefense() {
        return defense;
    }
}