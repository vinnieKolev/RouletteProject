package com.example.roulette;
import java.util.Random;

public class RouletteWheel {
    private int result=0;


    public void SpinWheel(){
        Random rand= new Random();
        int upperbound=37;
        result=rand.nextInt(upperbound);
        //Note 37 represents 00 on the board
    }

    public int getResult() {
        return result;
    }


}
