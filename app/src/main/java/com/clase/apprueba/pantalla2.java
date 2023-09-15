package com.clase.apprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        Button shortToastButton = findViewById(R.id.shortToastButton); // Reemplaza con el ID de tu botón
        Button longToastButton = findViewById(R.id.longToastButton); // Reemplaza con el ID de tu botón

        shortToastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastShort("Este es un mensaje corto desde pantalla2.");
            }
        });

        longToastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastLong("Este es un mensaje largo desde pantalla2.");
            }
        });
    }

    private void showToastShort(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void showToastLong(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}