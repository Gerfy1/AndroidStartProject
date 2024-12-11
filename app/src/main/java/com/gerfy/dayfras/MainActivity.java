package com.gerfy.dayfras;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Atributo
    String[] frases = {
            "Frase 01",
            "Frase 02",
            "Frase 03",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase (View view){

    }

    public void exibirTodas (View view){
        for (String frase : frases){
            System.out.println(frase);
        }
    }
}