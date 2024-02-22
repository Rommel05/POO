package Proyecto2;

import java.util.HashSet;
import java.util.Set;

public class GerenteVentas extends FuncionesVentas implements ContactoPresidente{
    private Presidente presidente;
    private Set<Vendedor> vendedores;
    public GerenteVentas(String nombre, String dni, Presidente presidente) {
        super(nombre, dni);
        this.presidente = presidente;
        this.vendedores = new HashSet<>();
    }

    public Set<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(Set<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public void addVendedores(Vendedor vendedor) {
        this.vendedores.add(vendedor);
    }

    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    @Override
    public void puesto() {
        System.out.println("Soy gerente de ventas");
    }

    @Override
    public void salario() {
        System.out.println("Mi salario es de 3000 euros");
    }

    @Override
    public void funcion() {
        System.out.println("Mi funcón es que las ventas vayan bien");
    }

    @Override
    public void contactoPresidente() {
        System.out.println("Tengo contacto con el presidente");
    }
}
