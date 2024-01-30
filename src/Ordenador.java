public class Ordenador {
    private double precio;
    private String marca;
    private String modelo;
    public Ordenador(double precio, String marca, String modelo) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
    }
    public Ordenador(double precio, String marca) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = "";
    }
    public Ordenador(double precio) {
        this.precio = precio;
        this.marca = "MSI";
        this.modelo = "Pluse GL79";
    }
    public double getPrecio() {
        return precio;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public String toString() {
        return getPrecio() + " - " + getMarca() + " - " + getModelo();
    }
}
