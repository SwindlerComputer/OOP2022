package ie.tudublin;

import processing.core.*;

public class IOBox {
    private float x;
    private float y;
    private float boxWidth;
    private float boxHeight;
    PApplet ui;
    public float gap;

    public IOBox(PApplet ui, float x, float y, float boxWidth, float boxHeight) {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.boxWidth = boxWidth;
        this.boxHeight = boxHeight;
    }

    public void render() {
        ui.stroke(33, 157, 150);
        ui.noFill();

        ui.rect(x,y,boxWidth,boxHeight);
    }
}