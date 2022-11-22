package com.findmykeys.findmykeys;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AdaptadorCerradura extends ArrayAdapter<Cerradura> {
    AppCompatActivity appCompatActivity;

    public AdaptadorCerradura(AppCompatActivity context) {
        super(context, R.layout.layout_cerradura,CerraduraController.getListaCerradura());
        appCompatActivity = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = appCompatActivity.getLayoutInflater();
        View item = inflater.inflate(R.layout.layout_cerradura, null);

        TextView tvNombre = item.findViewById(R.id.tvNombreCerradura);
        tvNombre.setText(CerraduraController.getListaCerradura().get(position).getNombreCerradura());

        TextView tvEstado = item.findViewById(R.id.tvEstado);
        boolean estado = CerraduraController.getListaCerradura().get(position).isEstado();
        if (estado){
            tvEstado.setText("Estado: Abierto");
        } else {
            tvEstado.setText("Estado: Cerrado");
        }



        return (item);
    }
}
