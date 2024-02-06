package libros;

import java.util.HashSet;
import java.util.Set;

public class Lector {
    private String nombre;
    private String dni;
    private Set<Historico> historicos;
    private Set<Prestamo> prestamos;

    public Lector(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.historicos = new HashSet<>();
        this.prestamos = new HashSet<>();
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<Historico> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(Set<Historico> historicos) {
        this.historicos = historicos;
    }
    public void addhistoricos(Historico historico) {
        this.historicos.add(historico);
    }

    @Override
    public String toString() {
        return this.nombre + " - " + this.dni;
    }
}
