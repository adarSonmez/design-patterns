package com.creational.design;

import java.awt.geom.Point2D;

public class Bitmap implements Image {
    private final String name;
    private Point2D location;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + name + "@" + location);
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        location = null;
        System.out.println("Bitmap " + name + " reset");
    }
}
