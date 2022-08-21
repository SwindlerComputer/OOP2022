package ie.tudublin;

import processing.core.*;

public class SidePanel extends PApplet{
    private float x;
    private float y;
    private float width;
    float diameter;
    PApplet ui;
    int col;

    public SidePanel(PApplet ui, float x, float y, float width, float diameter) {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.diameter = diameter;
        col = 1;
    }

    public void render() {
        ui.stroke(33, 157, 150);
        if (col == 1){
            ui.fill(33, 157, 150);  
        }
        else {
            ui.fill(33, 157, 150);  
        }  
        ui.ellipse(x, y, width, diameter);
    }

    public void update() {
        float disX = x - ui.mouseX;
        float disY = y - ui.mouseY;
        if(PApplet.sqrt((disX * disX) + (disY * disY)) < width) {
          col = -1;
        } 
    
        else {
          col = 1;
        }

    }
}