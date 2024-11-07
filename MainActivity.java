package com.example.reloginho;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private Button Fcinco;
    private TextClock HoraSegundo;
    private TextClock HoraMinuto;
    private TextView Atualizado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        atualizarRelogio();

        pegarHoracerta();

    }

    private void pegarHoracerta() {
        Fcinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Atualizado.setText("Hora Atual: "+HoraSegundo.getText());

            }
        });
    }


    private void atualizarRelogio() {
         HoraSegundo = findViewById(R.id.HoraSegundo);
         HoraMinuto = findViewById(R.id.HoraMinuto);
         Atualizado = findViewById(R.id.Atualizado);
         Fcinco = findViewById(R.id.Fcinco);
        }

}