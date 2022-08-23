package ie.tudublin;

import processing.core.PApplet;

public class Button {
    ScreenUI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;

    public Button(ScreenUI ui, float x, float y, float width, float height, String text) {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public void mousePressed() {
        float start = x;
        float w = width;
        float h = height;
        if (ui.mouseX > x && ui.mouseX < start + w
                && ui.mouseY > y && ui.mouseY < y + h) {
            System.out.println("Clicked");
        }
    }

    public void render() {
        float start = x;
        float w = width;
        float h = height;

        ui.noFill();
        ui.stroke(33, 157, 150);
        ui.rect(x, y, width, height);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.textSize(15);
        ui.text(text, x + width * 0.5f, y + height * 0.5f);

        if (ui.mouseX > x && ui.mouseX < start + w
                && ui.mouseY > y && ui.mouseY < y + h) {
            ui.fill(255, 0, 0);
        }
    }

    public Button(String string) {
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}