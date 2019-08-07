package com.example.belajarintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ungu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ungu);
    }
    public void ulang(View view) {
        Intent explicit = new Intent(this, merah.class);
        startActivity(explicit);
    }

}
