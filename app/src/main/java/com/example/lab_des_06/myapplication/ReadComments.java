package com.example.lab_des_06.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by LAB-DES-06 on 17/05/2018.
 */

public class ReadComments extends ActionBarActivity{
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_comments);
        Button cerrarSesion = (Button) findViewById(R.id.cerrar);
        cerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    ///mandar a la otra pantalla
                    Intent Inicio = new Intent(ReadComments.this, Login.class);
                    startActivity(Inicio);
//323 130 56 08



            }
        });
    }
}
