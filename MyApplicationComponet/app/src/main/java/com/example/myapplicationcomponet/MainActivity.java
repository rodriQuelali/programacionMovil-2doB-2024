package com.example.myapplicationcomponet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lanzar(View view){
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }

    public void lanzarInicio(View v){
        Intent intent = new Intent(this, inicio.class);
        startActivity(intent);
    }
}