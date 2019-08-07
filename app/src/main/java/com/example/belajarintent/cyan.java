package com.example.belajarintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class cyan extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cyan);
    }
    public void keempat(View view) {
        Intent explicit = new Intent(this, biru.class);
        startActivity(explicit);
    }

}
