package com.JoeSorensen;

import processing.core.PApplet;

import processing.core.PShape;

public class VoltronEasterEgg extends PApplet {

    private static String[] processingArgs = {"Voltron"};
    private PShape voltron;

    public void settings(){size(1920, 1080);}

    public void setup() {
        background(0);
        text("...", 960, 540, 200, 200);
        voltron = loadShape("com/JoeSorensen/history_classicvoltron.svg");
    }

    public void draw() {
        background(0);
        shape(voltron, 453, 0, 507, 853);
    }

    @Override public void exit(){
        dispose();
    }

    public static void main(String[] args){
        VoltronEasterEgg egg = new VoltronEasterEgg();
        PApplet.runSketch(processingArgs, egg);
    }
}
