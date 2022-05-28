package com.compositionChellange;

public class bedroom extends room{
    private int beds;
    private boolean acOnOrOff;
    int temp = 20;

    public bedroom(int length, int width, int windows, int lights, int beds, boolean acOnOrOff) {
        super(length, width, windows, lights);
        this.beds = beds;
        this.acOnOrOff = acOnOrOff;
    }


    public int getBeds() {
        return beds;
    }

    public boolean isAcOnOrOff() {
        return acOnOrOff;
    }

    public int getTemp() {
        return temp;
    }


    @Override
    public void unlock() {
        super.unlock();
        System.out.println("bedroom unlocked");
    }

    public void acOnOrOff(){
        if (acOnOrOff){
            System.out.println("ac is on");
        }else{
            System.out.println("ac is off");
        }
    }
    public void controlAc(int ac){
        temp += ac;
        System.out.println("the temperature is now "+ temp);
    }
}
