package com.JoeSorensen;

import processing.core.PApplet;

import controlP5.*;

import processing.core.PImage;

public class VoltronEasterEgg extends PApplet {

    private static String[] processingArgs = {"Voltron"};
    private PImage voltron;

    public void settings(){size(1920, 1080);}

    public void setup() {
        String src = "http://www.voltron.com/files/images/hi-res/landing/history_classicvoltron.png";
        voltron = loadImage(src, "png");
    }

    public void draw() {
        background(0);
        image(voltron, 453, 0, 507, 853);
    }

    @Override public void exit(){
        dispose();
    }

    public static void main(String[] args){
        VoltronEasterEgg egg = new VoltronEasterEgg();
        PApplet.runSketch(processingArgs, egg);
    }
}
