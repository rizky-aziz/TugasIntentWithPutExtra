package com.example.tugasintentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn = findViewById(R.id.btn_gofood);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent move = new Intent(MainActivity.this, with_move_data.class);
        startActivity(move);
    }
}
