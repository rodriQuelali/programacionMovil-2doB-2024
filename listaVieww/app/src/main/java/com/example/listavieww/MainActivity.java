package com.example.listavieww;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lp;
    private TextView tvR;
    private EditText txtP;
    private Button  btnA;
    ArrayList<String> paises;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarR();
        llenadoPaises();
        agregarPais();
    }
    public void cargarR(){
        lp = (ListView) findViewById(R.id.listaPaises);
        tvR=(TextView) findViewById(R.id.tvResul);
        txtP=(EditText) findViewById(R.id.txtPais);
        btnA=(Button) findViewById(R.id.btnAgregar);
    }

    public void llenadoPaises(){
        //ArrayList

        //String [] paises = {"Bolivia", "Peru", "Argentina", "Chile", "Paraguay", "Brasil", "Venezuela", "Ecuador", "Colombia"};
        paises = new ArrayList<String>();
        paises.add("Bolivia");

        String [] habitantes = {"25550", "1555", "30000", "58888", "10000", "150000", "1200000", "25555", "258888"};

         arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,paises);
        lp.setAdapter(arrayAdapter);
        lp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "la Poblacion de: " + lp.getItemAtPosition(position) + "es de: "+ habitantes[position], Toast.LENGTH_SHORT).show();
                tvR.setText("la Poblacion de: " + lp.getItemAtPosition(position) + "es de: "+ habitantes[position]);
            }
        });

    }

    public void agregarPais(){
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //paises.add("Bolivia");
                paises.add(txtP.getText().toString());
                lp.setAdapter(arrayAdapter);
            }
        });
    }
}