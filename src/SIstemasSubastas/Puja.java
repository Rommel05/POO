package SIstemasSubastas;

public class Puja {
    private double cantidd;
    private Pujador pujador;
    private Subastas subasta;
    public Puja(double cantidd, Pujador pujador, Subastas subasta) {
        this.cantidd = cantidd;
        this.pujador = pujador;
        this.subasta = subasta;
    }

    public double getCantidd() {
        return cantidd;
    }

    public void setCantidd(double cantidd) {
        this.cantidd = cantidd;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public Subastas getSubasta() {
        return subasta;
    }

    public void setSubasta(Subastas subasta) {
        this.subasta = subasta;
    }

    @Override
    public String toString() {
        return this.cantidd + "";
    }
}
