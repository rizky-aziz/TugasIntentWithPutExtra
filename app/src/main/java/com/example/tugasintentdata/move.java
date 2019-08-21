package com.example.tugasintentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class move extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        Button btn = findViewById(R.id.btn_cancel);
        btn.setOnClickListener(this);

        TextView name =(TextView)findViewById(R.id.nama);
        TextView alamat =(TextView)findViewById(R.id.alamat);
        TextView pesan =(TextView)findViewById(R.id.order_name);
        Bundle bundle = getIntent().getExtras();
        String name1 = bundle.getString("name");
        String alamat1 = bundle.getString("alamat");
        String pesan1 = bundle.getString("pesan");
        name.setText(name1);
        alamat.setText(alamat1);
        pesan.setText(pesan1);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
