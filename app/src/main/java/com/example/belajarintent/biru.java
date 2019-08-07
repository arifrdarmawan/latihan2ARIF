package com.example.belajarintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class biru extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biru);
    }
    public void kelima(View view) {
        Intent explicit = new Intent(this, ungu.class);
        startActivity(explicit);
    }
}
