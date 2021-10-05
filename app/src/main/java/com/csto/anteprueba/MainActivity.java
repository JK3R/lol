package com.csto.anteprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner Sp1, Sp2;
    Button Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sp1 = (Spinner)findViewById(R.id.spinner);
        Sp2 = (Spinner)findViewById(R.id.spinner2);

        Btn = (Button)findViewById(R.id.button);

        //botton De forma dinamica
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Validacion de Spinner, verifica que no eligan la misma ciudad
                if (Sp1.getSelectedItemPosition()==Sp2.getSelectedItemPosition())
                {
                    Toast.makeText(getApplicationContext(),"Origen y destino son iguales",Toast.LENGTH_LONG).show();
                }

                else
                {
                    //Señalar los spinner Con Origen y destino para luego llamarlos para darles un id y recibirlos en otra ventana
                    String Origen = Sp1.getSelectedItem().toString();
                    String Destino = Sp2.getSelectedItem().toString();
                    //Cambio de Pagina donde llamamos por el nombre de la pag agregada
                    Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                    //Llamamos a los spinner que señalamamos anteriormente para darles un id
                    I.putExtra("ORIGEN", Origen);
                    I.putExtra("DESTINO",Destino);

                    //Cambia de pag LLamando la variable del INTENT
                    startActivity(I);

                }

            }
        });
    }
}