package com.example.usuario.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @see android.app.Activity
 * @author Juan Manuel Diaz Ortiz
 * @version 1.0
 *
 * @commentario "Mi primera aplicación de Android"
 *
 */

public class MainActivity extends AppCompatActivity {

    private TextView _txvMenssage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creamos un findbyid para porder escribir en el layout
        _txvMenssage = ((TextView)findViewById(R.id.txvMessage));
        //con setTexto Escribimos en el TextView
        _txvMenssage.setText(R.string.bye);

    }
}
