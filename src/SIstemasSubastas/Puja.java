package SIstemasSubastas;

public class Puja {
    private double cantidad;

    private Pujador pujador;

    private Subastas subasta;

    private Lote lote;

    public Puja(double cantidad, Pujador pujador, Subastas subasta, Lote lote) {
        this.cantidad = cantidad;
        this.pujador = pujador;
        this.subasta = subasta;
        this.lote = lote;
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

    public Subastas getSubasta() {
        return subasta;
    }

    public void setSubasta(Subastas subasta) {
        this.subasta = subasta;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return this.cantidad + "";
    }
}
