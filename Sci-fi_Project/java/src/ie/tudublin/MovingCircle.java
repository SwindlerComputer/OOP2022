package ie.tudublin;

import processing.core.*;

public class MovingCircle {
    private float x;
    private float dx = 5;
    private float dy = 5;
    private float y;
    private float diameter;
    private float radius;
    private int hit = 1;
    private int rand = 1;
    ScreenUI ui;

    public MovingCircle(ScreenUI ui, float x, float y, float diameter) {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        radius = diameter / 2;

    }

    public void render() {
        if (hit == -1) {
            ui.stroke(50, rand, rand);
        } else
            ui.stroke(rand);
        ui.noFill();
        ui.ellipse(x, y, diameter, diameter);
        if (hit == -1)
            ui.fill(50, rand, rand);
        else
            ui.fill(rand);

        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.textSize(15);
        ui.text("I am a moving circle", x, y);

    }

    public void update() {
        x += dx;
        y += dy;
        if ((x > ui.width - radius) || (x < radius)) {
            dx *= -1;
            hit *= -1;
            rand = (int) ui.random(0, 255);
        }

        if ((y > ui.height - radius) || (y < radius)) {
            dy *= -1;
            hit *= -1;
            rand = (int) ui.random(0, 255);
        }

        if (PApplet.dist(ui.width / 2, ui.height / 2, x - radius, y - radius) == 200) {
            dy *= -1;
            dx *= -1;
        }

    }
}
