package com.csto.anteprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {


    String ORIGEN,DESTINO;
    TextView texto_origen,texto_destino,texto_total,texto_asiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        texto_origen=(TextView)findViewById(R.id.ciudad_origen);
        texto_destino=(TextView)findViewById(R.id.ciudad_destino);
        texto_total = (TextView)findViewById(R.id.texto_total);
        texto_asiento = (TextView)findViewById(R.id.texto_asientos);

        Bundle B = getIntent().getExtras();
        ORIGEN = B.getString("ORIGEN");
        DESTINO = B.getString("DESTINO");
        Integer TOTAL = B.getInt("TOTAL");
        Integer CONTADOR = B.getInt("CONTADOR");

        texto_origen.setText(ORIGEN);
        texto_destino.setText(DESTINO);
        texto_total.setText(""+TOTAL);
        //texto_total.setText(TOTAL.toString());
        texto_asiento.setText(""+CONTADOR);
    }
}