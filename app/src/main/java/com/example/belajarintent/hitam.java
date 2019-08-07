package com.example.belajarintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class hitam extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hitam);
    }
    public void ketiga(View view) {
        Intent explicit = new Intent(this, cyan.class);
        startActivity(explicit);
    }
}

