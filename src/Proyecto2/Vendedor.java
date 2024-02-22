package Proyecto2;

public class Vendedor extends FuncionesVentas{
    private GerenteVentas gerenteVentas;
    public Vendedor(String nombre, String dni, GerenteVentas gerenteVentas) {
        super(nombre, dni);
        this.gerenteVentas = gerenteVentas;
    }

    public GerenteVentas getGerenteVentas() {
        return gerenteVentas;
    }

    public void setGerenteVentas(GerenteVentas gerenteVentas) {
        this.gerenteVentas = gerenteVentas;
    }

    @Override
    public void puesto() {
        System.out.println("Soy un vendedor");
    }

    @Override
    public void salario() {
        System.out.println("Mi salario es de 1500 euros");
    }

    @Override
    public void funcion() {
        System.out.println("Mi función es vender los productos de la empresa");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
