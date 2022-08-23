package ie.tudublin;

import processing.core.*;

public abstract class Sprite {
    protected PVector pos;
    protected PVector forward;
    protected float rotation;
    protected float speed;
    protected ScreenUI ui;

    public Sprite(ScreenUI ui, float x, float y, float rotation, float speed) {
        this.ui = ui;
        pos = new PVector(x, y);
        forward = new PVector(0, -1);
        this.rotation = rotation;
        this.speed = speed;
    }

    public abstract void update();

    public abstract void render();

    public PVector getPos() {
        return pos;
    }

    public void setPos(PVector pos) {
        this.pos = pos;
    }

    public PVector getForward() {
        return forward;
    }

    public void setForward(PVector forward) {
        this.forward = forward;
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public ScreenUI getUi() {
        return ui;
    }

    public void setUi(ScreenUI ui) {
        this.ui = ui;
    }

}
