package com.example.tugasintentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class with_move_data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_move_data);

        final EditText name = (EditText)findViewById(R.id.txt_name);
        final EditText alamat = (EditText)findViewById(R.id.txt_alamat);
        final EditText pesan = (EditText)findViewById(R.id.txt_pesan);
        Button btn =(Button)findViewById(R.id.btn_pesan);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(with_move_data.this, move.class);
                i.putExtra("name", name.getText().toString());
                i.putExtra("alamat", alamat.getText().toString());
                i.putExtra("pesan", pesan.getText().toString());
                startActivity(i);
            }
        });
    }
}
