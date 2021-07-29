package com.example.roulette;
import java.util.Random;

public class RouletteWheel {
    private int result;


    public void SpinWheel(){
        Random rand= new Random();
        int upperbound=38;
        result=rand.nextInt(upperbound);
        //Note 37 represents 00 on the board
    }

    public char GetColor(){
        char color=' ';
        if(result==1||result==3||result==5||result==7||result==9||result==12||result==14||result==16||result==18||result==19||result==21||result==23||result==25||result==27||result==30||result==32||result==34||result==36){
            color = 'r';
        }
        else if(result==2||result==4||result==6||result==8||result==10||result==11||result==13||result==15||result==17||result==20||result==22||result==24||result==26||result==28||result==29||result==31||result==33||result==35){
            color='b';
        }
        else
            color='g';
        return color;

    }



    public int getResult() {
        return result;
    }


}
