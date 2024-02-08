package maquina_expendedora;

import java.util.ArrayList;

public class Maquina {
    private ArrayList<Double> tique;
    private double dineroIntroducido;
    private ArrayList<Double> cajon;

    public Maquina(ArrayList<Double> tique, ArrayList<Double> cajon) {
        this.tique = tique;
        this.cajon = cajon;
    }

    public ArrayList<Double> getTique() {
        return tique;
    }

    public void setTique(ArrayList<Double> tique) {
        this.tique = tique;
    }

    public double getDineroIntroducido() {
        return dineroIntroducido;
    }

    public void setDineroIntroducido(double dineroIntroducido) {
        this.dineroIntroducido = dineroIntroducido;
    }

    public ArrayList<Double> getCajon() {
        return cajon;
    }

    public void setCajon(ArrayList<Double> cajon) {
        this.cajon = cajon;
    }

    @Override
    public String toString() {
        return this.tique + " - " + this.dineroIntroducido + " - " + this.cajon;
    }
}
