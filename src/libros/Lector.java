package libros;

import java.util.HashSet;
import java.util.Set;

public class Lector {
    private String nombre;
    private String dni;
    private Set<Ejemplar> ejemplares;

    public Lector(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.ejemplares = new HashSet<>();
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

    public Set<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Set<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }
    public void addEjemplares(Ejemplar ejemplar) {
        this.ejemplares.add(ejemplar);
    }

    @Override
    public String toString() {
        return this.nombre + " - " + this.dni;
    }
}
