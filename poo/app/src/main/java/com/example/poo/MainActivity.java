package com.example.poo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.poo.clases.Operaciones;

public class MainActivity extends AppCompatActivity {

    Operaciones operaciones;
    EditText txt1,txt2;
    TextView tvResultado;
    Button btnOperar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* casting
        int s=2;
        float f = 2.4f;
        float res = (float) s+f;
        ******
        Integer.parseInt(f);*/


        txt1 = (EditText) findViewById(R.id.txtnumero1);
        txt2 = (EditText) findViewById(R.id.txt2);
        tvResultado = (TextView) findViewById(R.id.tvResultado);
        btnOperar = (Button) findViewById(R.id.btnSuma);

        btnOperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val1 = txt1.getText().toString();
                String val2 = txt2.getText().toString();
                int n1 = Integer.parseInt(val1);
                int n2 = Integer.parseInt(val2);
                operaciones = new Operaciones();
                tvResultado.setText(String.valueOf(operaciones.suma(n1, n2)));
            }
        });

    }

    public void sumar(){
        String val1 = txt1.getText().toString();
        String val2 = txt2.getText().toString();
        int n1 = Integer.parseInt(val1);
        int n2 = Integer.parseInt(val2);
        operaciones = new Operaciones();
        tvResultado.setText(String.valueOf(operaciones.suma(n1, n2)));
        //System.out.print("la suma es: " + operaciones.suma());
    }
}