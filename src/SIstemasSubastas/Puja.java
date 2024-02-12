package SIstemasSubastas;

public class Puja {
    private double cantidad;

    private Pujador pujador;

    public Puja(double cantidad, Pujador pujador) {
        this.cantidad = cantidad;
        this.pujador = pujador;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }
}
