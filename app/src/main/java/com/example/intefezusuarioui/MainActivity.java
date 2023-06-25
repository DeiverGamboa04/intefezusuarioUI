package com.example.intefezusuarioui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        guardar = (Button)findViewById(R.id.btEnviar);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                EditText txtNombre = (EditText)findViewById(R.id.txtnombre);
                EditText txtCedula = (EditText)findViewById(R.id.txtcedula);
                EditText txtFECHA = (EditText)findViewById(R.id.editTextfecha);
                EditText txtCiudad = (EditText)findViewById(R.id.txtciudad);
                EditText txtCorreo = (EditText)findViewById(R.id.editTextTextcorreo);
                EditText txtTelefono = (EditText)findViewById(R.id.editTexttelefono);





                Bundle b = new Bundle();
                b.putString("NOMBRE", txtNombre.getText().toString());
                b.putString("CEDULA", txtCedula.getText().toString());
                b.putString("FECHA", txtFECHA.getText().toString());
                b.putString("CIUDAD", txtCiudad.getText().toString());
                b.putString("CORREO", txtCorreo.getText().toString());
                b.putString("TELEFONO", txtTelefono.getText().toString());

                intent.putExtras(b);

                startActivity(intent);
            }
        });
    }



}