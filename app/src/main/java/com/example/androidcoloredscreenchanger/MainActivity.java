package com.example.androidcoloredscreenchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button switchToGreenScreen, switchToRedScreen, switchToBlueScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchToGreenScreen = findViewById(R.id.buttonGreen);
        switchToRedScreen = findViewById(R.id.buttonRed);
        switchToBlueScreen = findViewById(R.id.buttonBlue);

        switchToGreenScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchToGreenScreen();
            }
        });

        switchToRedScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchToRedScreen();
            }
        });

        switchToBlueScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchToBlueScreen();
            }
        });



    }

    private void switchToGreenScreen() {
        Intent switchGreenScreenIntent = new Intent(this, GreenScreen.class);
        startActivity(switchGreenScreenIntent);
    }

    private void switchToRedScreen() {
        Intent switchRedScreenIntent = new Intent(this, RedScreen.class);
        startActivity(switchRedScreenIntent);
    }

    private void switchToBlueScreen() {
        Intent switchBlueScreenIntent = new Intent(this, BlueScreen.class);
        startActivity(switchBlueScreenIntent);
    }
}