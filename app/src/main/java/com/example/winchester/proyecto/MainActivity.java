package com.example.winchester.proyecto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // registrarEventos();
    }

public void SIGUIENTE (View Next){
    Intent intent = new Intent(this, InfoParque.class);
    intent.putExtra("NOMBRE PARQUE", "RESERVA CHICAQUE");
    startActivity(intent);
}
    /*private void registrarEventos (){
        ListView parques = (ListView) findViewById(R.id.NombreParque);

        parques.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String itemSeleccionado = adapterView.getItemAtPosition(i).toString();

                Toast.makeText(getApplicationContext(), "Haz hecho click en " + itemSeleccionado, Toast.LENGTH_SHORT).show();
            }
        });
    }*/
}
