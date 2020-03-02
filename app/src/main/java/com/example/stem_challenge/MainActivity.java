package com.example.stem_challenge;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        counter = 0;
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.test_button);
        final TextView text = findViewById(R.id.count);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                text.setText(Integer.toString(counter));
            }
        });
    }


}
