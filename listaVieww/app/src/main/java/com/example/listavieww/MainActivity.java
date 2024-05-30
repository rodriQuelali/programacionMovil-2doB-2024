package com.example.listavieww;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lp;
    private TextView tvR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarR();
        llenadoPaises();
    }
    public void cargarR(){
        lp = (ListView) findViewById(R.id.listaPaises);
        tvR=(TextView) findViewById(R.id.tvResul);
    }

    public void llenadoPaises(){
        //ArrayList
        
        String [] paises = {"Bolivia", "Peru", "Argentina", "Chile", "Paraguay", "Brasil", "Venezuela", "Ecuador", "Colombia"};
        String [] habitantes = {"25550", "1555", "30000", "58888", "10000", "150000", "1200000", "25555", "258888"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,paises);
        lp.setAdapter(arrayAdapter);
        lp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "la Poblacion de: " + lp.getItemAtPosition(position) + "es de: "+ habitantes[position], Toast.LENGTH_SHORT).show();
                tvR.setText("la Poblacion de: " + lp.getItemAtPosition(position) + "es de: "+ habitantes[position]);
            }
        });

    }
}