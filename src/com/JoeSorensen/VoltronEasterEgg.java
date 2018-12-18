package com.JoeSorensen;

import processing.core.PApplet;

import controlP5.*;

public class VoltronEasterEgg extends PApplet {

    private static String[] processingArgs = {"Voltron"};
    private ControlP5 cp5;
    private Textarea myTextarea;
    private Textfield myTextfield;

    public void settings(){size(1920, 1080);}

    public void setup() {
        cp5 = new ControlP5(this);
        background(0);
        myTextarea = cp5.addTextarea("txt").setPosition(0,0).setSize(1920,1080).setLineHeight(14)
                .setColorBackground(color(0,100)).setColorForeground(color(255,100))
                .scroll(1).hideScrollbar();
        //myTextarea.setText(s);
    }

    public void draw() {
        background(0);
    }

    public static void main(String[] args){
        VoltronEasterEgg egg = new VoltronEasterEgg();
        PApplet.runSketch(processingArgs, egg);
    }
}
