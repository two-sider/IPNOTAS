package com.example.rlcr.ipnotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirMenu(View v){
        Intent SelectActivity = new Intent(getApplicationContext(), menu.class);
        startActivity(SelectActivity);
    }
    public void abrirCreditos(View v){
        Intent SelectActivity = new Intent(getApplicationContext(), creditos.class);
        startActivity(SelectActivity);
    }
}
