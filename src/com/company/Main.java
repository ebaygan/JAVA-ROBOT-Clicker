package com.company;
import java.awt.*;
import java.awt.event.InputEvent;

public class Main {

    public static void main(String[] args) {
        try {
            Robot Rob = new Robot();
            while (true) {
                Thread.sleep(1000);
                Rob.mousePress(InputEvent.BUTTON1_MASK);
                Rob.mouseRelease(InputEvent.BUTTON1_MASK);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
