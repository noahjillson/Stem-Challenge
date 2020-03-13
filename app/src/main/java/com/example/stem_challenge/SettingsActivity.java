package com.example.stem_challenge;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class SettingsActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        dl = (DrawerLayout)findViewById(R.id.activity_settings);
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
                        Toast.makeText(SettingsActivity.this, "Home",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(SettingsActivity.this, MainActivity.class);
                        startActivity(i);
                        break;
                    case R.id.settings:
                        Toast.makeText(SettingsActivity.this, "Settings",Toast.LENGTH_SHORT).show();
                        Intent i2 = new Intent(SettingsActivity.this, SettingsActivity.class);
                        startActivity(i2);
                        break;
                    case R.id.map:
                        Toast.makeText(SettingsActivity.this, "Map",Toast.LENGTH_SHORT).show();
                        Intent i3 = new Intent(SettingsActivity.this, MapActivity.class);
                        startActivity(i3);
                        break;
                    default:
                        return true;
                }


                return true;

            }
        });


    }
}
