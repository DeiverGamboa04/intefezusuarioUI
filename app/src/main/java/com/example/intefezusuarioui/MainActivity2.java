package com.example.intefezusuarioui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView txtrespuestas = (TextView)findViewById(R.id.txtrespuesta);

        Bundle bundle = this.getIntent().getExtras();

        txtrespuestas.setText("Hola!, Bienvenido \n " +
                bundle.getString("NOMBRE \n" +
                        bundle.getString("CEDULA \n" +
                                bundle.getString("FECHA \n" +
                                        bundle.getString("CIUDAD \n" +
                                                bundle.getString("CORREO \n" +
                                                        bundle.getString("TELEFONO")))))));
    }


}