package com.example.roulette;

public class Payouts {



    public static int straightBet(int bet) {
        return bet + (bet * 35);
    }

    public static int splitBet(int bet) {
        return bet + (bet * 17);
    }

    public static int streetBet(int bet) {
        return bet + (bet * 11);
    }

    public static int trioBet(int bet) {
        return bet + (bet * 11);
    }

    public static int cornerBet(int bet) {
        return bet + (bet * 8);
    }

    public static int topLineBet(int bet) {
        return bet + (bet * 6);
    }

    public static int doubleStreetBet(int bet) {
        return bet + (bet * 5);
    }

    public static int columnBet(int bet) {
        return bet + (bet * 2);
    }

    public static int dozenBet(int bet) {
        return bet + (bet * 2);
    }

    public static int oddEven(int bet) {
        return bet + bet;
    }

    public static int redBlack(int bet) {
        return bet + bet;
    }

    public static int lowHigh(int bet) {
        return bet + bet;
    }
}
