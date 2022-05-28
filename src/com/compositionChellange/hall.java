package com.compositionChellange;

public class hall extends room{
    private int seats;
    private boolean tvOnOrOff;

    public hall(int length, int width, int windows, int lights, int seats, boolean tvOnOrOff) {
        super(length, width, windows, lights);
        this.seats = seats;
        this.tvOnOrOff = tvOnOrOff;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isTvOnOrOff() {
        return tvOnOrOff;
    }

    @Override
    public void unlock() {
        super.unlock();
        System.out.println("hall unlocked");
    }

    public void tv(){
        if (tvOnOrOff){
            System.out.println("tv is on");
        }else{
            System.out.println("tv is off");
        }
    }
}
