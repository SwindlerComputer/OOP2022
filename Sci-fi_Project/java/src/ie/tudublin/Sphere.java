package ie.tudublin;

import processing.core.*;

public class Sphere {
    ScreenUI ui;
    private float x;
    private float y;
    private float width;
    private float height;

    public Sphere(ScreenUI ui, float x, float y, float width, float height) {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void render() {
        float w = width;
        float h = height;
        ui.size(600, 600);
        ui.fill(255);
        ui.lights();
        ui.translate(w / 2, h / 2);
        ui.sphere(200);

    }

    public ScreenUI getUi() {
        return ui;
    }

    public void setUi(ScreenUI ui) {
        this.ui = ui;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

}