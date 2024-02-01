package banco;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorriente {
    private int nCuenta;
    private Sucursal sucursal;
    private Set<Cliente> clientes;
    private Set<Domicializacion> domicializaciones;

    public CuentaCorriente(int nCuenta, Sucursal sucursal) {
        this.nCuenta = nCuenta;
        this.sucursal = sucursal;
        this.clientes = new HashSet<>();
        this.domicializaciones = new HashSet<>();
    }

    public Set<Domicializacion> getDomicializaciones() {
        return domicializaciones;
    }

    public void setDomicializaciones(Set<Domicializacion> domicializaciones) {
        this.domicializaciones = domicializaciones;
    }
    public void addDom(Domicializacion dom) {
        this.domicializaciones.add(dom);
    }
    public void addCli(Cliente cliente) {
        this.clientes.add(cliente);
    }
    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    @Override
    public String toString() {
        return this.nCuenta + " - " + this.clientes;
    }
}
