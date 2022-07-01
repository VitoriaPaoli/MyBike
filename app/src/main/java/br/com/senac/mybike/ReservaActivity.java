package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ReservaActivity extends AppCompatActivity {
    FloatingActionButton fabReservar;
    DatePicker dtpReservas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reserva_layout);

        fabReservar = findViewById(R.id.fabReservar);

        fabReservar = findViewById(R.id.fabReservar);
        dtpReservas = findViewById(R.id.dtpReservas);

        fabReservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Reserva realizada!!!",
                        Toast.LENGTH_SHORT).show();

            }
        });

        int mes = dtpReservas.getMonth();
        int dia = dtpReservas.getDayOfMonth();
        int ano = dtpReservas.getYear();

        String montagem = "Voce estar no" + dia + "/" + mes + "/" + ano;
    }
}