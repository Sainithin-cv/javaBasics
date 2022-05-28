package com.udemy;

public class MethodChallenge {
    public static void main(String[] args) {
      int a=  calculateHighScorePosition(1500);
      int b=  calculateHighScorePosition(900);
      int c=  calculateHighScorePosition(400);
      int d=  calculateHighScorePosition(50);
        displayHighScorePosition("ravi", a);
        displayHighScorePosition("raju", b);
        displayHighScorePosition("kiran", c);
        displayHighScorePosition("vikram", d);
    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + ", you managed to get into position "+ position +" on the high score position");

    }
    public static int calculateHighScorePosition(int playerScore){
       if (playerScore>=1000){
           return 1;
       }else if(500<=playerScore && playerScore<1000){
           return 2;
        }else if(100<=playerScore && playerScore<500){
           return 3;
       }else {
           return 4;
       }
    }
}
