package com.example.proyectofinalapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EquiposData {
        @SerializedName("data")
        List<Equipos> equiposList;

        public List<Equipos> getEquiposList() {
            return equiposList;
        }

        public void setEquiposList(List<Equipos> equiposList) {
            this.equiposList = equiposList;
        }
    }

