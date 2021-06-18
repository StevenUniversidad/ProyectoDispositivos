package com.example.proyectofinalapi;

import com.google.gson.annotations.SerializedName;

public class Players {

    @SerializedName("id")
    private String idPlayer;

    @SerializedName("first_name")
    private String first_name;


    @SerializedName("last_name")
    private String last_name;

    @SerializedName("position")
    private String position;

    @SerializedName("height_feet")
    private String height_feet;

    @SerializedName("height_inches")
    private String height_inches;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHeight_feet() {
        return height_feet;
    }

    public void setHeight_feet(String height_feet) {
        this.height_feet = height_feet;
    }

    public String getHeight_inches() {
        return height_inches;
    }

    public void setHeight_inches(String height_inches) {
        this.height_inches = height_inches;
    }

    public String getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(String idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
