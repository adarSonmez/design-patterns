package com.creational.design;

// Doesn't support cloning
public class General extends GameUnit {
    private String state = "idle";

    public void boostMorale() {
        this.state = "boosting morale";
    }

    public void stopBoostMorale() {
        this.state = "idle";
    }

    @Override
    public String toString() {
        return "General{" +
                "state='" + state + '\'' +
                ", position=" + getPosition() +
                '}';
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("General units cannot be reset");
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("General units cannot be cloned");
    }
}
