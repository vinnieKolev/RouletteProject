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
    int totalBet;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        totalBet=0;
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);



        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        betcount = (TextView) findViewById(R.id.totalbet);





    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);

        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void onClick(View view) {
//       list.add(getResources().getResourceEntryName(view.getId()));
       list.add((String) view.getTag());

        totalBet+=currentChip;
        betcount.setText("Total bet: "+ totalBet);


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