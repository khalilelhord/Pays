package com.example.pays;

import java.util.ArrayList;

public class Pays {
    public static ArrayList<Pays>listPays = new ArrayList<>();
    private int logo;
    private String indicatif;
    private String Drapeau;
    private String capital;
    private String Continent;

    @Override
    public String toString() {
        return "Pays{" +
                "logo=" + logo +
                ", indicatif='" + indicatif + '\'' +
                ", Drapeau='" + Drapeau + '\'' +
                ", capital='" + capital + '\'' +
                ", Continent='" + Continent + '\'' +
                '}';
    }

    public static ArrayList<Pays> getListPays() {
        return listPays;
    }

    public static void setListPays(ArrayList<Pays> listPays) {
        Pays.listPays = listPays;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getIndicatif() {
        return indicatif;
    }

    public void setIndicatif(String indicatif) {
        this.indicatif = indicatif;
    }

    public String getDrapeau() {
        return Drapeau;
    }

    public void setDrapeau(String drapeau) {
        Drapeau = drapeau;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public Pays(int logo, String indicatif, String drapeau, String capital, String continent) {
        this.logo = logo;
        this.indicatif = indicatif;
        Drapeau = drapeau;
        this.capital = capital;
        Continent = continent;
    }
}
