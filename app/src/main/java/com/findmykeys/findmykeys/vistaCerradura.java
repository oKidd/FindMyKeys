package com.findmykeys.findmykeys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class vistaCerradura extends AppCompatActivity {
    private int cerraduraId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_cerradura);
        TextView tvNombreCerraduraVista = findViewById(R.id.tvNombreCerraduraVista);
        TextView tvEstadoCerraduraVista = findViewById(R.id.tvEstadoCerraduraVista);
        Switch switchCerradura = findViewById(R.id.switchCerradura);
        Intent intent = getIntent();

        // Accessing the data using key and value
        cerraduraId = intent.getIntExtra("CerraduraId", -1);

        if (cerraduraId != -1) {

            tvNombreCerraduraVista.setText(CerraduraController.getListaCerradura().get(cerraduraId).getNombreCerradura());

            boolean estado = CerraduraController.getListaCerradura().get(cerraduraId).isEstado();
            if (estado){
                tvEstadoCerraduraVista.setText("Estado: Abierto");
                switchCerradura.setChecked(true);

            } else {
                tvEstadoCerraduraVista.setText("Estado: Cerrado");
                switchCerradura.setChecked(false);
            }

        }
    }

    public void btnAtras(View v){
        Intent ilistaCerraduras = new Intent(this, lista.class);
        startActivity(ilistaCerraduras);
    }

    public void irAConfig(View v){
        Intent iconfig = new Intent(this, ConfigCerradura.class);
        startActivity(iconfig);
    }
}