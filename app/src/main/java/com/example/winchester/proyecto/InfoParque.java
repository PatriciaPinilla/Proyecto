package com.example.winchester.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class InfoParque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_parque);
        Intent intent = getIntent();
        String extra = intent.getStringExtra("NOMBRE PARQUE");
        Toast.makeText(this, "EL NOMBRE DEL PARQUE ES: " + extra, Toast.LENGTH_SHORT).show();
    }
}
