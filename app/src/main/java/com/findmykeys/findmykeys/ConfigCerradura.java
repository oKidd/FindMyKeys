package com.findmykeys.findmykeys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfigCerradura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_cerradura);
    }

    public void btnAtras(View v){
        Intent ilistaCerraduras = new Intent(this, lista.class);
        startActivity(ilistaCerraduras);
    }
}