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

import com.example.roulette.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    TextView betcount;
    List<String> list = new ArrayList<String>();
    int currentChip=0;
    int totalBet=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_first);

        betcount = (TextView) findViewById(R.id.totalbet);
        betcount.setText("Total Bet: "+totalBet);


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
        list.add((String) view.getTag());
        totalBet+=currentChip;
        betcount.setText("Total Bet: "+totalBet);

        if(currentChip!=0) {
            list.add((String) view.getTag());
            totalBet += currentChip;
            betcount.setText("Total Bet: " + totalBet);
        }
    }


    public int spin(View view){

        RouletteWheel a = new RouletteWheel();
        a.SpinWheel();
        System.out.println(a.getResult());
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