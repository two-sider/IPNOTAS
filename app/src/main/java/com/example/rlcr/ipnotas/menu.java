package com.example.rlcr.ipnotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class menu extends AppCompatActivity {
    //EditTexts
    private EditText epr1;
    private EditText epe1;
    private EditText epr2;
    private EditText epe2;
    private EditText eva1;
    private EditText eva2;
    private EditText eva3;
    private EditText eva4;
    private EditText examen;
    //Buttons
    private Button btn_sinexamen;
    private Button btn_conexamen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void calcular_sinexamen(View v){
        btn_sinexamen = (Button) findViewById(R.id.btn_sinexamen);
        btn_sinexamen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                epr1 = (EditText) findViewById(R.id.txt_epr1);
                epr2 = (EditText) findViewById(R.id.txt_epr2);
                epe1 = (EditText) findViewById(R.id.txt_epe1);
                epe2 = (EditText) findViewById(R.id.txt_epe2);
                eva1 = (EditText) findViewById(R.id.txt_eva1);
                eva2 = (EditText) findViewById(R.id.txt_eva2);
                eva3 = (EditText) findViewById(R.id.txt_eva3);
                eva4 = (EditText) findViewById(R.id.txt_eva4);

                double notaepr1 = Double.parseDouble(epr1.getText().toString());
                double notaepr2 = Double.parseDouble(epr2.getText().toString());
                double notaepe1 = Double.parseDouble(epe1.getText().toString());
                double notaepe2 = Double.parseDouble(epe2.getText().toString());
                double notaeva1 = Double.parseDouble(eva1.getText().toString());
                double notaeva2 = Double.parseDouble(eva2.getText().toString());
                double notaeva3 = Double.parseDouble(eva3.getText().toString());
                double notaeva4 = Double.parseDouble(eva4.getText().toString());



                double promedio_eva = (notaeva1+notaeva2+notaeva3+notaeva4)/4;
                double promedio = ((notaepr1*0.1)+(notaepe1*0.15)+(notaepr2*0.2)+(notaepe2*0.25)+(promedio_eva*0.3));
                Double.toString(promedio);

                if(notaepr1 <=4.0 || notaepr2 <=4.0 || notaepe1 <=4.0 || notaepe2 <=4.0 || promedio_eva<=4.0 || promedio<5.5){
                    Toast toast1 =
                            Toast.makeText(getApplicationContext(), "Vas a EXAMEN y Tu promedio es:" + promedio, Toast.LENGTH_LONG);

                    toast1.show();

                }else{
                    Toast toast1 =
                            Toast.makeText(getApplicationContext(), "NO vas a EXAMEN y Tu promedio es:" + promedio, Toast.LENGTH_LONG);

                    toast1.show();
                }









            }
        });
    }

    public void calcular_conexamen(View v){
        btn_conexamen = (Button) findViewById(R.id.btn_conexamen);
        btn_conexamen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                epr1 = (EditText) findViewById(R.id.txt_epr1);
                epr2 = (EditText) findViewById(R.id.txt_epr2);
                epe1 = (EditText) findViewById(R.id.txt_epe1);
                epe2 = (EditText) findViewById(R.id.txt_epe2);
                eva1 = (EditText) findViewById(R.id.txt_eva1);
                eva2 = (EditText) findViewById(R.id.txt_eva2);
                eva3 = (EditText) findViewById(R.id.txt_eva3);
                eva4 = (EditText) findViewById(R.id.txt_eva4);
                examen = (EditText) findViewById(R.id.txt_examen);

                double notaepr1 = Double.parseDouble(epr1.getText().toString());
                double notaepr2 = Double.parseDouble(epr2.getText().toString());
                double notaepe1 = Double.parseDouble(epe1.getText().toString());
                double notaepe2 = Double.parseDouble(epe2.getText().toString());
                double notaeva1 = Double.parseDouble(eva1.getText().toString());
                double notaeva2 = Double.parseDouble(eva2.getText().toString());
                double notaeva3 = Double.parseDouble(eva3.getText().toString());
                double notaeva4 = Double.parseDouble(eva4.getText().toString());
                double notaexamen = Double.parseDouble(examen.getText().toString());




                double promedio_eva = (notaeva1+notaeva2+notaeva3+notaeva4)/4;
                double promedio = ((notaepr1*0.1)+(notaepe1*0.15)+(notaepr2*0.2)+(notaepe2*0.25)+(promedio_eva*0.3));
                double promedio_examen = (promedio*0.3)+(notaexamen*0.7);


                if(promedio_examen>=4.0){
                    Toast toast1 =
                            Toast.makeText(getApplicationContext(), "Felicitaciones Pasaste y Tu promedio es:" + promedio_examen, Toast.LENGTH_LONG);

                    toast1.show();

                }else{


                    Toast toast1 =
                            Toast.makeText(getApplicationContext(), "Reprobaste y Tu promedio es:" + promedio_examen, Toast.LENGTH_LONG);

                    toast1.show();
                }









            }
        });
    }
}
