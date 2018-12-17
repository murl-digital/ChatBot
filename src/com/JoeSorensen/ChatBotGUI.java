package com.JoeSorensen;

import processing.core.PApplet;

import java.util.*;

public class ChatBotGUI extends PApplet {

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        background(0);
    }

    public void draw() {

    }

    public static void main(String[] args) {
        String[] processingArgs = {"ChatBotGUI"};
        ChatBotGUI front = new ChatBotGUI();
        PApplet.runSketch(processingArgs, front);
        Chatbot chat = new Chatbot();
        System.out.println(chat.getGreeting());
        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();
        while (!statement.equals("Bye")) {
            System.out.println(chat.getResponse(statement));
            statement = in.nextLine();
            break;
        }
    }
}
