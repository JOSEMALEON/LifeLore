package com.example.lifelore;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button partidaButton;
    private Button reglasButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar los botones invisibles
        partidaButton = findViewById(R.id.partidaButton);
        reglasButton = findViewById(R.id.reglasButton);

        // Asignar listeners a los botones invisibles
        partidaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mostrar un Toast al pulsar el botón de "Partida"
                Toast.makeText(MainActivity.this, "Botón de partida pulsado", Toast.LENGTH_SHORT).show();

                // Opcional: Navegar a la actividad de partida
                // Intent partidaIntent = new Intent(MainActivity.this, PartidaActivity.class);
                // startActivity(partidaIntent);
            }
        });

        reglasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mostrar un Toast al pulsar el botón de "Reglas"
                Toast.makeText(MainActivity.this, "Botón de reglas pulsado", Toast.LENGTH_SHORT).show();

                // Opcional: Navegar a la actividad de reglas
                // Intent reglasIntent = new Intent(MainActivity.this, ReglasActivity.class);
                // startActivity(reglasIntent);
            }
        });
    }
}
