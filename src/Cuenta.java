public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return getTitular() + " - " + getCantidad();
    }
    public void ingrear(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = this.cantidad + cantidad;
        }
    }
    public void retirar(double cantidad) {
        if (this.cantidad - cantidad > 0) {
            this.cantidad = this.cantidad - cantidad;
        } else {
            this.cantidad = 0;
        }
    }
}
