package com.example.roulette;
import java.util.Random;

public class RouletteWheel {
    private int result=0;
    char color=' ';


    public void SpinWheel(){
        Random rand= new Random();
        int upperbound=38;
        result=rand.nextInt(upperbound);
        //Note 37 represents 00 on the board
    }


    public char getColor(){

        if(result==1||result==3||result==5||result==7||result==9||result==12||result==14||result==16||result==18||result==19||result==21||result==23||result==25||result==27||result==30||result==32||result==34||result==36){
            this.color = 'r';
        }
        else if(result==2||result==4||result==6||result==8||result==10||result==11||result==13||result==15||result==17||result==20||result==22||result==24||result==26||result==28||result==29||result==31||result==33||result==35){
            this.color='b';
        }
        else
            this.color='g';
        return  this.color;

    }

    public int getEvenOdd() {

        if(result==0||result==37){
            return -1;

        }else {
            if (result % 2 == 0)
                return 0;
            else return 1;
        }



    }

    public int getDozen() {

        if(result==0||result==37){
            return -1;

        }else {
            if(result/12==0)
                return 1;
            if(result/12==1)
                return 2;
            if(result/12==2)
                return 3;
        }

        return 3;
    }

    public int getColumn() {
        if(result==0||result==37){
            return -1;

        }else {
            if(result%3==0)
                return 3;
            if(result%3==2)
                return 2;
            if(result%3==1)
                return 1;
        }
        return -1;
    }

    public int getHighLow() {
        if(result==0||result==37){
            return -1;

        }else {
            if(result/18==0)
                return 1;
            if(result/18==1)
                return 2;

        }
        return 2;
    }

    public int getResult() {
        return result;
    }


}
