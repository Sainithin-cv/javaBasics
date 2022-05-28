package com.compositionChellange;

public class Main {
    public static void main(String[] args) {
        hall hall= new hall(80, 40, 3, 5, 8, false);
        bedroom bedroom = new bedroom(50, 40, 2, 4, 1, true);

        house nithins = new house(hall, bedroom);

        house.gate();
        house.hall.unlock();
        house.bedroom.unlock();
        house.hall.tv();
        house.bedroom.controlAc(10);
    }
}
