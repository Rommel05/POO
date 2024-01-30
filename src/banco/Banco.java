package banco;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private int numEntidad;
    private String nombre;
    private Set<Sucursal> sucursales;
    public Banco(int numEntidad, String nombre, Set<Sucursal> sucursales) {
        this.numEntidad = numEntidad;
        this.nombre = nombre;
        this.sucursales = new HashSet<>();
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }
    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
    public void addSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    public int getNumEntidad() {
        return numEntidad;
    }

    public void setNumEntidad(int numEntidad) {
        this.numEntidad = numEntidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return getNombre();
    }
}
