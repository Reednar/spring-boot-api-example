package com.recipe.recipe.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BodyDTO {

    @JsonProperty("date_enrol")
    private String dateEnrol;

    @JsonProperty("date_maj")
    private String dateMaj;

    @JsonProperty("idpivot")
    private String idPivot;

    @JsonProperty("key")
    private String key;

    @JsonProperty("statut")
    private String statut;

    @JsonProperty("moyen")
    private String moyen;

    @JsonProperty("idapp")
    private String idApp;

    @JsonProperty("marque")
    private String marque;

    @JsonProperty("modele")
    private String modele;

    @JsonProperty("os")
    private String os;

    // Getters and Setters

    public String getDateEnrol() {
        return dateEnrol;
    }

    public void setDateEnrol(String dateEnrol) {
        this.dateEnrol = dateEnrol;
    }

    public String getDateMaj() {
        return dateMaj;
    }

    public void setDateMaj(String dateMaj) {
        this.dateMaj = dateMaj;
    }

    public String getIdPivot() {
        return idPivot;
    }

    public void setIdPivot(String idPivot) {
        this.idPivot = idPivot;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getMoyen() {
        return moyen;
    }

    public void setMoyen(String moyen) {
        this.moyen = moyen;
    }

    public String getIdApp() {
        return idApp;
    }

    public void setIdApp(String idApp) {
        this.idApp = idApp;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
