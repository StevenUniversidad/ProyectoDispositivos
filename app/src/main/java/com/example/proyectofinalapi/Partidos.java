package com.example.proyectofinalapi;

import com.google.gson.annotations.SerializedName;

public class Partidos {

    @SerializedName("id")
    private String idpartido;

    @SerializedName("date")
    private String date;

    @SerializedName(" home_team_score")
    private String  home_team_score;

    @SerializedName("visitor_team_score")
    private String visitor_team_score;

    @SerializedName("season")
    private String season;

    @SerializedName("period")
    private String period;

    @SerializedName("status")
    private String status;


    public String getHome_team_score() {
        return home_team_score;
    }

    public void setHome_team_score(String home_team_score) {
        this.home_team_score = home_team_score;
    }

    public String getVisitor_team_score() {
        return visitor_team_score;
    }

    public void setVisitor_team_score(String visitor_team_score) {
        this.visitor_team_score = visitor_team_score;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdpartido() {
        return idpartido;
    }

    public void setIdpartido(String idpartido) {
        this.idpartido = idpartido;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
