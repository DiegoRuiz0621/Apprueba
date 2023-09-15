package com.clase.apprueba;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class FechayHora extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{
    private EditText etFecha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fechay_hora);
        //calendario

        Calendar calendario = Calendar.getInstance();
        int anio=calendario.get(Calendar.YEAR);
        int mes=calendario.get(Calendar.MONTH);
        int dia=calendario.get(Calendar.DAY_OF_MONTH);


        // 1. enlazar nuestro widget
        // Obtén una referencia al EditText por su ID
        EditText etFecha = findViewById(R.id.etFecha);

        // 2. CREAR UN CUADRO DE DIALOG QUE NOS PERMITA SELECCIONAR LA FECHA
        DatePickerDialog datepickerdialog= new DatePickerDialog(this);
            // 3. ASIGNAR EL EVENTO AL EDITEXT
         etFecha.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 //4. invocar el datepickerdialog
                 datepickerdialog.show();

             }
         });

    }

    @Override
    public void onDateSet(DatePicker datePicker, int anio,int mes, int dia) {
        String fecha=dia+"/"+mes+"/"+anio;
        etFecha.setText(fecha);

    }
}
