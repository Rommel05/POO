package banco;

public class Prestamo {
    private int nPres;
    private int cantidad;
    private Sucursal sucursal;

    public Prestamo(int nPres, int cantidad, Sucursal sucursal) {
        this.nPres = nPres;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
    }

    public int getnPres() {
        return nPres;
    }

    public void setnPres(int nPres) {
        this.nPres = nPres;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return getCantidad() + "";
    }
}
