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

public class MapActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);


        dl = (DrawerLayout)findViewById(R.id.activity_map);
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
                        Toast.makeText(MapActivity.this, "Home",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MapActivity.this, MainActivity.class);
                        startActivity(i);
                        break;
                    case R.id.settings:
                        Toast.makeText(MapActivity.this, "Settings",Toast.LENGTH_SHORT).show();
                        Intent i2 = new Intent(MapActivity.this, SettingsActivity.class);
                        startActivity(i2);
                        break;
                    case R.id.map:
                        Toast.makeText(MapActivity.this, "Map",Toast.LENGTH_SHORT).show();
                        Intent i3 = new Intent(MapActivity.this, MapActivity.class);
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
