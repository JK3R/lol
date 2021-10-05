package com.csto.anteprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String ORIGEN, DESTINO;
    TextView TotalFalso;
    Integer MontoReal=0;
    Button Btn2;
    CheckBox Chk1,Chk2,Chk3,Chk4,Chk5,Chk6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TotalFalso = (TextView)findViewById(R.id.total_falso);
        Btn2 = (Button)findViewById(R.id.button2);
        Chk1 = (CheckBox)findViewById(R.id.checkBox1);
        Chk2 = (CheckBox)findViewById(R.id.checkBox2);
        Chk3 = (CheckBox)findViewById(R.id.checkBox3);
        Chk4 = (CheckBox)findViewById(R.id.checkBox4);
        Chk5 = (CheckBox)findViewById(R.id.checkBox5);
        Chk6 = (CheckBox)findViewById(R.id.checkBox6);

        String Monto="";

        //Llamr los id de origen y destino de la pag anterior
        Bundle B = getIntent().getExtras();
        ORIGEN = B.getString("ORIGEN");
        DESTINO = B.getString("DESTINO");

        if((ORIGEN.equals("TALCA"))&&(DESTINO.equals("CAUQUENES")))
        {
            Monto="$4.000";
            MontoReal=4000;
        }
        if((ORIGEN.equals("TALCA"))&&(DESTINO.equals("LINARES")))
        {
            Monto="$2.000";
            MontoReal=2000;
        }
        if((ORIGEN.equals("TALCA"))&&(DESTINO.equals("TENO")))
        {
            Monto="$5.000";
            MontoReal=5000;
        }
        if((ORIGEN.equals("LINARES"))&&(DESTINO.equals("TALCA")))
        {
            Monto="$2.000";
            MontoReal=2000;
        }
        if((ORIGEN.equals("LINARES"))&&(DESTINO.equals("CAUQUENES")))
        {
            Monto="$3.000";
            MontoReal=3000;
        }
        if((ORIGEN.equals("LINARES"))&&(DESTINO.equals("TENO")))
        {
            Monto="$4.000";
            MontoReal=4000;
        }
        TotalFalso.setText(Monto);

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Contar cuantos Asientos seleccione el usuario

                Integer Asientos=0,contador=0;
                if(Chk1.isChecked()==true)
                {
                    //contador++;
                    contador=contador+1;
                    Asientos=Asientos+300;
                }
                if(Chk2.isChecked()==true)
                {
                    //contador++;
                    contador=contador+1;
                    Asientos=Asientos+300;
                }
                if(Chk3.isChecked()==true)
                {
                    //contador++;
                    contador=contador+1;
                    Asientos=Asientos+300;
                }
                if(Chk4.isChecked()==true)
                {
                    //contador++;
                    contador=contador+1;
                    Asientos=Asientos+200;
                }
                if(Chk5.isChecked()==true)
                {
                    //contador++;
                    contador=contador+1;
                    Asientos=Asientos+200;
                }
                if(Chk6.isChecked()==true)
                {
                    //contador++;
                    contador=contador+1;
                    Asientos=Asientos+200;
                }

                Intent I = new Intent(getApplicationContext(),MainActivity3.class);
                //Cambiar pag con el total de la suma de asiento + monto real
                Integer TotalUltraFinal=Asientos+MontoReal;
                I.putExtra("ORIGEN", ORIGEN);
                I.putExtra("DESTINO",DESTINO);
                I.putExtra("TOTAL",TotalUltraFinal);
                I.putExtra("CONTADOR",contador);

                startActivity(I);


            }
        });

    }
}