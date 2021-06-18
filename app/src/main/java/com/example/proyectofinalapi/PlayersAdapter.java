package com.example.proyectofinalapi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class PlayersAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Players> mydata;

    public PlayersAdapter (Activity activity, List<Players> playersList){

        this.activity = activity;
        this.mydata = playersList;
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
            v = inf.inflate(R.layout.player_item, null);
        }

        Players players = mydata.get(position);

        TextView namePlayers = v.findViewById(R.id.txtname);
        namePlayers.setText(players.getFirst_name());

        return v;
    }
}
