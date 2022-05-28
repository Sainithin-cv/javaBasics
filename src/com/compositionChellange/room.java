package com.compositionChellange;

public class room {
    private int length;
    private int width;
    private int windows;
    private int lights;

    public room(int length, int width, int windows, int lights) {
        this.length = length;
        this.width = width;
        this.windows = windows;
        this.lights = lights;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getWindows() {
        return windows;
    }

    public int getLights() {
        return lights;
    }

    public void unlock(){
        System.out.println("room is unlocked");
    }
}
