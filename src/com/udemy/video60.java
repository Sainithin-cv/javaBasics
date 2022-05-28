package com.udemy;

public class video60 {
    public static void main(String[] args) {
        System.out.println(  getDurationString(1000));
    }
    public static String getDurationString(int min, int sec){
        if(min<0 || sec<0 || sec>59){
            return ("invalid values");
        }
        int hrs= min/60;
        int remainingMins= min % 60;
        return (hrs+"h "+remainingMins+"m "+sec+"s");
    }
    public static String getDurationString(int sec){
        if(sec<0){
            return ("invalid");
        }
        int secInMin = sec / 60;
        int remainingSec = sec % 60;
        return getDurationString(secInMin, remainingSec);
    }
}
