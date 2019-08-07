package com.example.belajarintent;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button pertama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blank);
        pertama = findViewById(R.id.blank);
        pertama.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.blank:
                Intent explicit = new Intent(getApplicationContext(), merah.class);
                startActivity(explicit);
                break;
                default:
                                                                                                                                                                                                                                                                                                 break;
        }
    }
}