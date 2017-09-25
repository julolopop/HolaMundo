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

        _txvMenssage = ((TextView)findViewById(R.id.txvMessage));
        _txvMenssage.setText(R.string.bye);

    }
}
