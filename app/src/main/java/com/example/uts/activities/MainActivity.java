package com.example.uts.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.uts.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlertentang(View view) {

    }

    public void handleMulai(View view) {
        Intent intent = new Intent(this, MulaiActivity.class);
        startActivity(intent);
    }
}
