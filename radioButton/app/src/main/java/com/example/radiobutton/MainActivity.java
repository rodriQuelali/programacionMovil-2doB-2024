package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //inicializar las variables
    private EditText caja1, caja2;
    private TextView resultado;
    private RadioButton rbSuma, rbResta;
    private Button operar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caja1 = (EditText) findViewById(R.id.txt1);
        caja2 = (EditText) findViewById(R.id.txt2);
        resultado = (TextView) findViewById(R.id.tvResul);
        rbSuma = (RadioButton) findViewById(R.id.rb1);
        rbResta = (RadioButton) findViewById(R.id.rb2);
        operar = (Button) findViewById(R.id.btnOperar);

        //lanzar le metodo onclick bajo codigo.
        operar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val1=caja1.getText().toString();
                String val2=caja2.getText().toString();
                int num1 = Integer.parseInt(val1);
                int num2 = Integer.parseInt(val2);
                int resul;
                if(rbSuma.isChecked() == true){
                    resul = num1 +num2;
                    String respuestTexto = String.valueOf(resul);
                    resultado.setText(respuestTexto);
                } else if (rbResta.isChecked() == true) {
                    resul = num1 -num2;
                    String respuestTexto = String.valueOf(resul);
                    resultado.setText(respuestTexto);
                }

            }
        });

    }
}