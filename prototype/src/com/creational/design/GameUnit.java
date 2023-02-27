package com.creational.design;

import java.awt.geom.Point2D;

public abstract class GameUnit implements Cloneable {
    private final Point2D position;

    public GameUnit() {
        this.position = new Point2D.Double(0, 0);
    }

    public GameUnit(float x, float y) {
        this.position = new Point2D.Double(x, y);
    }

    public void move(float x, float y) {
        this.position.setLocation(x, y);
    }

    public Point2D getPosition() {
        return position;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
            GameUnit clone = (GameUnit) super.clone();
            clone.initialize();
            return clone;
    }

    protected void initialize() {
        this.position.setLocation(0, 0);
        reset();
    }

    protected abstract void reset();
}

