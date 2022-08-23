package ie.tudublin;

import processing.core.*;

public class Planet extends Sprite {

    public Planet(ScreenUI ui) {
        super(ui, ui.random(0, ui.width), ui.random(0, ui.height), 0, ui.random(2, 10));
        forward.x = ui.random(-1, 1);
        forward.y = ui.random(-1, 1);
        forward.normalize();

    }

    @Override
    public void update() {

        pos.add(PVector.mult(forward, speed));
        rotation += 0.012f;

        if (pos.x < 0) {
            pos.x = ui.width;
        }
        if (pos.x > ui.width) {
            pos.x = 0;
        }
        if (pos.y < 0) {
            pos.y = ui.height;
        }
        if (pos.y > ui.height) {
            pos.y = 0;
        }
    }

    int size = 200;
    float planetSize = ui.random(100, size);
    float r = ui.random(100, 129);
    float g = ui.random(100, 129);
    float b = ui.random(100, 120);

    @Override
    public void render() {
        ui.noStroke();
        ui.pushMatrix();
        ui.translate(pos.x, pos.y);
        ui.rotate(rotation);
        ui.fill(r, g, b);
        ui.ellipse(-size / 2, -size / 2, planetSize, planetSize);
        ui.popMatrix();

    }
}