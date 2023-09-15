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

public class TareaDashboard extends AppCompatActivity {

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
                "CV"//un boton que te dirija a otro activity
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

                        Intent intento = new Intent(getApplicationContext(), pantalla1.class);
                        //inicio el intent
                        startActivity(intento);
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(), "Mostrando mensajes", Toast.LENGTH_LONG).show();
                        Intent intento2 = new Intent(getApplicationContext(), pantalla2.class);
                        //inicio el intent
                        startActivity(intento2);
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(), "CV", Toast.LENGTH_LONG).show();
                        Intent intento3 = new Intent(getApplicationContext(), pantalla3.class);
                        //inicio el intent
                        startActivity(intento3);
                        break;
                }
            }
        });
    }
}