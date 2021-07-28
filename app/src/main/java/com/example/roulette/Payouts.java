package com.example.roulette;

public class Payouts {

    // This is a Utility class. No instances.
    private Payouts() {}

    public static int straight(int bet) {
        return bet + (bet * 35);
    }

    public static int green(int bet) {
        return bet + (bet * 35);
    }

    public static int twoConsecutive(int bet) {
        return bet + (bet * 17);
    }

    public static int threeConsecutive(int bet) {
        return bet + (bet * 11);
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
