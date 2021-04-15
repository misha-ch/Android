package com.example.myfirstandroidprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.dz1);
        setContentView(R.layout.dz);

    }

    public void switchLayout(View view) {
        setContentView(R.layout.dz1);
    }
    public void switchLayout1(View view) {
        setContentView(R.layout.activity_main);
    }
    public void switchLayout2(View view) {
        setContentView(R.layout.dz);
    }
}
