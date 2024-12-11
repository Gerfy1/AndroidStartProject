package com.gerfy.dayfras;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Random;

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
        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(3);
        String frase = frases[numeroAleatorio];
        texto.setText(frase);
    }

    public void exibirTodas (View view){
        TextView texto = findViewById(R.id.textResultado);

        String textoResultado = "";
        for (String frase : frases){
            textoResultado = textoResultado + frase + "\n";
        }

        texto.setText(textoResultado);
    }
}