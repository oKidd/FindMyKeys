package com.findmykeys.findmykeys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class lista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        AdaptadorCerradura adaptador = new AdaptadorCerradura(this);
        ListView lvCerradura = findViewById(R.id.lvCerradura);
        lvCerradura.setAdapter(adaptador);

        if (CerraduraController.getListaCerradura().size() < 1) {

            CerraduraController.addCerradura(101,"Cerradura Casa",false);
            CerraduraController.addCerradura(102,"Cerradura Oficina",true);

        }
        lvCerradura.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent iVistaCerradura = new Intent(getApplicationContext(), vistaCerradura.class);
                iVistaCerradura.putExtra("CerraduraId", i);
                //Toast.makeText(lista.this, "id: "+ i + ", nombre: " + CerraduraController.getListaCerradura().get(i).getNombreCerradura(), Toast.LENGTH_SHORT).show();
                startActivity(iVistaCerradura);
            }
        });
    }

    public void irAConfig(View v){
        Intent iconfig = new Intent(this, ConfigCerradura.class);
        startActivity(iconfig);
    }

    public void salir(View v){
        Intent iInicioSesion = new Intent(this, MainActivity.class);
        startActivity(iInicioSesion);
    }
}