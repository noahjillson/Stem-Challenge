package com.example.stem_challenge;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;


import com.google.android.material.navigation.NavigationView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button Declaration
        Button settingsButon = (Button) findViewById(R.id.buttonToSettings);

        //OnClickListener for the Button settingsButton
        settingsButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //On Click, the SettingsActivity is run
                Intent i = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(i);
            }
        });

        /*
        Creates the DrawerLayout from the activity_main which is formatted as a drawer layout in
        xml. This Drawer Layout is saved as dl. An ActionBarDrawerToggle is saved as t.
        */
        dl = (DrawerLayout)findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl, R.string.open, R.string.close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = (NavigationView)findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.home:
                        Toast.makeText(MainActivity.this, "Home",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(i);
                        break;
                    case R.id.settings:
                        Toast.makeText(MainActivity.this, "Settings",Toast.LENGTH_SHORT).show();
                        Intent i2 = new Intent(MainActivity.this, SettingsActivity.class);
                        startActivity(i2);
                        break;
                    case R.id.map:
                        Toast.makeText(MainActivity.this, "Map",Toast.LENGTH_SHORT).show();
                        Intent i3 = new Intent(MainActivity.this, MapActivity.class);
                        startActivity(i3);
                        break;
                    default:
                        return true;
                }


                return true;

            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }
}
