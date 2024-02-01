package banco;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private int numSucursal;
    private String direccion;
    private Banco banco;
    private Set<Prestamo> prestamos;
    private Set<CuentaCorriente> cuentas;

    public Sucursal(int numSucursal, String direccion, Banco banco) {
        this.numSucursal = numSucursal;
        this.direccion = direccion;
        this.banco = banco;
        this.prestamos = new HashSet<>();
        this.cuentas = new HashSet<>();
    }

    public Set<CuentaCorriente> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Set<CuentaCorriente> cuentas) {
        this.cuentas = cuentas;
    }
    public void addCuenta(CuentaCorriente cuenta) {
        this.cuentas.add(cuenta);
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
        return this.numSucursal + " " + this.banco + " " + this.direccion;
    }
}
