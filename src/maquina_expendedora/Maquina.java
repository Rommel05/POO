package maquina_expendedora;

public class Maquina {
    private int tique;
    private int dineroIntroducido;
    private int cajon;

    public Maquina(int tique, int cajon) {
        this.tique = tique;
        this.cajon = cajon;
    }

    public int getCajon() {
        return cajon;
    }

    public void setCajon(int cajon) {
        this.cajon = cajon;
    }

    public int getTique() {
        return tique;
    }

    public void setTique(int tique) {
        this.tique = tique;
    }

    public int getDineroIntroducido() {
        return dineroIntroducido;
    }

    public void setDineroIntroducido(int dineroIntroducido) {
        this.dineroIntroducido = dineroIntroducido;
    }

    @Override
    public String toString() {
        return this.tique + " - " + this.dineroIntroducido + " - " + this.cajon;
    }
}
