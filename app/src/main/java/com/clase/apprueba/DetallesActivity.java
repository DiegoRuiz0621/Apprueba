package com.clase.apprueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DetallesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        /*Ciclo de vida de un activity
         * 1. Create
         * 2. Start
         * 3. Resume
         * 4. Pause
         * 5. Stop
         * 6. Destroy
         * */

        Button btnIngresar = findViewById(R.id.btnIngresar);
        Button btnCancelar = findViewById(R.id.btnCancelar);
        EditText editcorreo = findViewById(R.id.editTextCorreo);
        EditText editcontrasenia = findViewById(R.id.editContrasenia);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //colocar la accion que queremos que haga el boton
                // agregar mensaje a la pantalla
                Toast.makeText(getApplicationContext(),"mensaje que quieras mostrar",
                        Toast.LENGTH_LONG).show();

                //CREAR UN INTENT PARA ACCEDER A LA INTERFAZ DE DASHBOARD
                //PASO 1. CREO EL INTENT para acceder a la interfaz del dashboard
                Intent intento = new Intent(getApplicationContext(),DasboardActivity.class);
                //inicio el intent
                startActivity(intento);
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //aqui va el contenido de la accion
                Toast.makeText(getApplicationContext(),"mensaje que quieras mostrar2",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);

        return true;
    }
}