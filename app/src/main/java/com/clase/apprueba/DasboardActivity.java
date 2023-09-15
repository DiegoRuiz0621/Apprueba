package com.clase.apprueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class DasboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasboard);
        //paso 1 enlazara mi listview
        ListView lvPracticas = findViewById(R.id.lvPracticas);
        // paso 2. Crear un arreglo
        final String[] arregloPracticas = { //final es para crear una constante como un const
                "Conociendo widgets", //10 widgets en un layout vertical
                "Mostrando mensajes",//dos botones que muestren mensajes short y long
                "CV",//un boton que te dirija a otro activity
                "Menu de Opciones"
        };


        //Paso 3. Crear el adaptar de LISTVIEW
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arregloPracticas);//contexto de donde esta el array,
        //paso 4. asigno el adaptar a mi list view
        lvPracticas.setAdapter(adapter);

        //PASO 5. AGREGAR UN EVENTO A CADA ITEM
        lvPracticas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Toast.makeText(getApplicationContext(), "Conociendo widgets", Toast.LENGTH_LONG).show();
                        Intent intent1 = new Intent(DasboardActivity.this, Practicas.class);
                        startActivity(intent1);
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(), "Mostrando mensajes", Toast.LENGTH_LONG).show();
                        Intent intent2 = new Intent(DasboardActivity.this, Practicas2.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "Uso de intents", Toast.LENGTH_LONG).show();
                        Intent intent3 = new Intent(DasboardActivity.this, pantalla3.class);
                        startActivity(intent3);
                        break;
                }
            }
        });

        // Establece OnClickListener para el botón que redirige a Activity2
        botonIrAActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DasboardActivity.this, Practicas.class);
                startActivity(intent);
            }
        });

        // Establece OnClickListener para el botón que redirige a Activity3
        .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DasboardActivity.this, Practicas2.class);
                startActivity(intent);
            }
        });
    }
}