package com.example.proyectofinalapi;

import com.google.gson.annotations.SerializedName;

public class Equipos {

    @SerializedName("id")
    private String idequipo;

    @SerializedName("city")
    private String ciudad;

    @SerializedName("abbreviation")
    private String  abbreviation;

    @SerializedName("conference")
    private String  conference;

    @SerializedName("division")
    private String  division;

    @SerializedName("full_name")
    private String  full_name;

    @SerializedName("name")
    private String  name;

    public String getAbbreviation() {
        return abbreviation;
    }




    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(String idequipo) {
        this.idequipo = idequipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
