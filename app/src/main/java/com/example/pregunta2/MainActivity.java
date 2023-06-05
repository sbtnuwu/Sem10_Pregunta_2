package com.example.pregunta2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnToast;
    private ListView listView;
    private ArrayAdapter<String> adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.buttonFinalizar);
        btnToast.setOnClickListener(this);

        listView = findViewById(R.id.list_view);

        // Array de ejemplo con los elementos de la lista
        String[] items = {"Big Data", "Simulación de Sistemas", "Análisis y Diseño de Sistemas", "Desarrollo de Aplicaciones para Móviles", "Arquitectura de Computadoras","Sistemas Operativos","Sistemas de Información"};

        // Adaptador para el ListView
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonFinalizar){
            Toast.makeText(this, "Matrícula completa", Toast.LENGTH_SHORT).show();
        }
    }
}