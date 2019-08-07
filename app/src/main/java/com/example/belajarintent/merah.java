package com.example.belajarintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class merah extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.merah);
    }
    public void kedua(View view) {
        Intent explicit = new Intent(this, hitam.class);
        startActivity(explicit);
    }
}