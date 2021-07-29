package com.example.roulette;

public class Player {

    private int balance;

    public Player(){
        this.balance=1000;
    }
    public Player(int startBalance){
        this.balance=startBalance;
    }

    public int getBalance(){
        return this.balance;
    }
    public void addBalance(int amount){
        this.balance+=amount;
    }
    public void takeBalance(int amount){
        this.balance-=amount;
    }

    public void setBalance(int amount) {
        this.balance = amount;
    }

}
