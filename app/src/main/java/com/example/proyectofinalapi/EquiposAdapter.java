package com.example.proyectofinalapi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class EquiposAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Equipos> mydata;

    public EquiposAdapter (Activity activity, List<Equipos> equiposList){

        this.activity = activity;
        this.mydata = equiposList;
    }

    @Override
    public int getCount() {
        return mydata.size();
    }

    @Override
    public Object getItem(int position) {
        return mydata.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (convertView == null){

            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.equipos_item, null);
        }

        Equipos equipos = mydata.get(position);

        TextView nameEquipos = v.findViewById(R.id.txt_nombre_equipo);
        nameEquipos.setText(equipos.getFull_name());



        return v;
    }
}
