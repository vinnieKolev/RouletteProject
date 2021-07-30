package com.example.roulette;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    TextView betcount;
    TextView playerBal;

    List<String> list = new ArrayList<String>();
    RouletteWheel a = new RouletteWheel();
    Payouts payouts=new Payouts();

    EditText inputbalance;
    TextView Balanceview;
    int inputedbalance;
    String inputstring;
    Button submit;

    Scanner input = new Scanner(System.in);
    Player player=new Player();
    int currentChip=0;
    int totalBet=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_first);



        betcount = (TextView) findViewById(R.id.totalbet);
        playerBal= (TextView) findViewById(R.id.playerBalance);

        inputbalance = (EditText)findViewById(R.id.Balance);
        Balanceview = (TextView)findViewById(R.id.playerBalance);
        Balanceview.setText("Balance: $"+ player.getBalance());

        submit = (Button)findViewById(R.id.submitbutton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputstring = inputbalance.getText().toString();
                inputedbalance = Integer.valueOf(inputstring);
                player.setBalance(inputedbalance);
                Balanceview.setText("Balance: $"+ player.getBalance());
            }
        });








        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);



    }


    public void onClick(View view) {
//      list.add(getResources().getResourceEntryName(view.getId()));

        if(currentChip!=0 && player.getBalance()-currentChip>=0){
        list.add((String) view.getTag());
        totalBet+=currentChip;
        player.takeBalance(currentChip);
        betcount.setText("Total Bet: $"+totalBet);
        playerBal.setText("Balance: $"+player.getBalance());

        }
    }

    public int spin(View view){
        a.SpinWheel();
        System.out.println(a.getResult()+"------------------------------------");
        System.out.println(a.getColor());
        System.out.println(a.getEvenOdd());
        System.out.println(a.getDozen());
        System.out.println(a.getColumn());
        System.out.println(a.getHighLow());


        return a.getResult();
    }

    public void pickChip(View view) {
        if(getResources().getResourceEntryName(view.getId()).equals("redchip"))
            currentChip=5;
        if(getResources().getResourceEntryName(view.getId()).equals("bluechip"))
            currentChip=10;
        if(getResources().getResourceEntryName(view.getId()).equals("graychip"))
            currentChip=20;
        if(getResources().getResourceEntryName(view.getId()).equals("greenchip"))
            currentChip=25;
        if(getResources().getResourceEntryName(view.getId()).equals("orangechip"))
            currentChip=50;
        if(getResources().getResourceEntryName(view.getId()).equals("blackchip"))
            currentChip=100;
    }



    }