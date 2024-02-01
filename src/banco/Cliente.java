package banco;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private int nCli;
    private String dni;
    private String nombre;
    private Set<Prestamo> prestamos;
    private Set<CuentaCorriente> cuentas;

    public Cliente(int nCli, String dni,String nombre) {
        this.nCli = nCli;
        this.dni = dni;
        this.nombre = nombre;
        this.prestamos = new HashSet<>();
        this.cuentas = new HashSet<>();
    }
    public void addCuenta(CuentaCorriente cuenta) {
        this.cuentas.add(cuenta);
    }

    public Set<CuentaCorriente> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Set<CuentaCorriente> cuentas) {
        this.cuentas = cuentas;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    public void addPres(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    public int getnCli() {
        return nCli;
    }

    public void setnCli(int nCli) {
        this.nCli = nCli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nCli + " - " + this.nombre + " - " + this.cuentas;
    }
}
