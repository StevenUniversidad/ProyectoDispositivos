package com.example.proyectofinalapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("data")
    List<Players> playersList;

    public List<Players> getPlayersList() { return playersList; }

    public void setPlayersList(List<Players> playersList) {
        this.playersList = playersList;
    }
}
