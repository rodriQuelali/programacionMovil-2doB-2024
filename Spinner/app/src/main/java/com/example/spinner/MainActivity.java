package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText cj1, cj2;
    private TextView tvResul;
    private Button btnOp;
    private Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarR();
    }
    public void cargarR(){
        cj1 = (EditText) findViewById(R.id.txt1);
        cj2 = (EditText) findViewById(R.id.txt2);
        tvResul = (TextView) findViewById(R.id.tvR);
        btnOp = (Button) findViewById(R.id.btnOperar);
        sp =(Spinner) findViewById(R.id.spOpe);
    }
    public void cargarDataSpinner(){
        String [] operaciones = {"suma", "resta", "multiplicacion","division"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,operaciones);
    }
}