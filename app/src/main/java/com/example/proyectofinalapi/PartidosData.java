package com.example.proyectofinalapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PartidosData {

        @SerializedName("data")
        List<Partidos> partidosList;

        public List<Partidos> getPartidosList() {
            return partidosList;
        }

        public void setPartidosList(List<Partidos> partidosList) {
            this.partidosList = partidosList;
        }
    }

