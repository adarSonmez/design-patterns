package com.creational.design;

public class Swordsman extends GameUnit {
    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    public void stopAttack() {
        this.state = "idle";
    }

    @Override
    public String toString() {
        return "Swordsman{" +
                "state='" + state + '\'' +
                ", position=" + getPosition() +
                '}';
    }

    @Override
    protected void reset() {
        this.state = "idle";
    }
}
