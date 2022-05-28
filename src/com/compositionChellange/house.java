package com.compositionChellange;

public class house {
    public static hall hall;
    public static bedroom bedroom;

    public house(com.compositionChellange.hall hall, com.compositionChellange.bedroom bedroom) {
        this.hall = hall;
        this.bedroom = bedroom;
    }

    public com.compositionChellange.hall getHall() {
        return hall;
    }

    public com.compositionChellange.bedroom getBedroom() {
        return bedroom;
    }

    public static void gate(){
        System.out.println("gate unlocked");
    }
}
