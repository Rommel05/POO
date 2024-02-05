package libros;

import java.util.HashSet;
import java.util.Set;

public class Lector {
    private String nombre;
    private String dni;
    private Set<Historico> historicos;

    public Lector(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.historicos = new HashSet<>();
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
