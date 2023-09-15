package com.clase.apprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Practicas2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicas2);

        Button botonMensajeCorto = findViewById(R.id.botonMensajeCorto);
        botonMensajeCorto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarMensajeCorto();
            }
        });

        Button botonMensajeLargo = findViewById(R.id.botonMensajeLargo);
        botonMensajeLargo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarMensajeLargo();
            }
        });
    }

    private void mostrarMensajeCorto() {
        Toast.makeText(this, "Mensaje corto", Toast.LENGTH_SHORT).show();
    }

    private void mostrarMensajeLargo() {
        Toast.makeText(this, "Este es un mensaje largo que demuestra cómo mostrar un toast con más contenido.", Toast.LENGTH_LONG).show();
    }
    }
