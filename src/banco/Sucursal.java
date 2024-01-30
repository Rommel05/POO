package banco;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private int numSucursal;
    private String direccion;
    private Banco banco;
    private Set<Prestamo> prestamos;

    public Sucursal(int numSucursal, String direccion, Banco banco) {
        this.numSucursal = numSucursal;
        this.direccion = direccion;
        this.banco = banco;
        this.prestamos = new HashSet<>();
    }

    public int getNumSucursal() {
        return numSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Banco getBanco() {
        return banco;
    }
    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }
    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    @Override
    public String toString() {
        return this.numSucursal + " " + this.banco;
    }
}
