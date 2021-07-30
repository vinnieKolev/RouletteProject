package com.example.roulette;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
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

    Scanner input = new Scanner(System.in);
    Player player=new Player();
    int currentChip=0;
    int totalBet=0;

    ImageView addview;
    ConstraintLayout layout;
    TextView currentText;
    ImageView currentImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_first);

        layout = findViewById(R.id.FirstFragment);
        addview = findViewById(R.id.red);


        betcount = (TextView) findViewById(R.id.totalbet);
        playerBal= (TextView) findViewById(R.id.playerBalance);



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

    //  System.out.print(getResources().getResourceEntryName(view.getId()));


       String temp=getResources().getResourceEntryName(view.getId());





        if(temp.contains("X"))
       {currentText = findViewById(view.getId());
           ImageView imageView = new ImageView(MainActivity.this);

           if( currentChip==5)
               imageView.setImageResource(R.drawable.redchip);
           if( currentChip==10)
               imageView.setImageResource(R.drawable.bluechip);
           if( currentChip==20)
               imageView.setImageResource(R.drawable.graychip);
           if( currentChip==25)
               imageView.setImageResource(R.drawable.greenchip);
           if( currentChip==50)
               imageView.setImageResource(R.drawable.orangechip);
           if( currentChip==100)
               imageView.setImageResource(R.drawable.blackchip);

           addvieW(imageView, 50, 50);

       }else {


            currentImage=findViewById(view.getId());
            ImageView imageView = new ImageView(MainActivity.this);

            if( currentChip==5)
                imageView.setImageResource(R.drawable.redchip);
            if( currentChip==10)
                imageView.setImageResource(R.drawable.bluechip);
            if( currentChip==20)
                imageView.setImageResource(R.drawable.graychip);
            if( currentChip==25)
                imageView.setImageResource(R.drawable.greenchip);
            if( currentChip==50)
                imageView.setImageResource(R.drawable.orangechip);
            if( currentChip==100)
                imageView.setImageResource(R.drawable.blackchip);
            addvieW2(imageView, 50, 50);

       }







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


    private void addvieW(ImageView imageView, int width, int height) {
        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(width, height);

        ConstraintLayout.LayoutParams oldparams = (ConstraintLayout.LayoutParams) currentText.getLayoutParams();


        params.topToBottom = oldparams.topToBottom;
        params.startToEnd = oldparams.startToEnd;
        params.bottomToBottom = oldparams.bottomToBottom;
        params.bottomToTop= oldparams.bottomToTop;
        params.endToStart = oldparams.endToStart;
        params.startToStart = oldparams.startToStart;
        params.endToEnd = oldparams.endToEnd;



        // setting the margin in linearlayout


        imageView.setLayoutParams(params);

        // adding the image in layout
        layout.addView(imageView);
    }

    private void addvieW2(ImageView imageView, int width, int height) {
        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(width, height);

        ConstraintLayout.LayoutParams oldparams = (ConstraintLayout.LayoutParams) currentImage.getLayoutParams();


        params.topToBottom = oldparams.topToBottom;
        params.startToEnd = oldparams.startToEnd;
        params.bottomToBottom = oldparams.bottomToBottom;
        params.bottomToTop= oldparams.bottomToTop;
        params.endToStart = oldparams.endToStart;
        params.startToStart = oldparams.startToStart;
        params.endToEnd = oldparams.endToEnd;



        // setting the margin in linearlayout


        imageView.setLayoutParams(params);

        // adding the image in layout
        layout.addView(imageView);
    }
    }