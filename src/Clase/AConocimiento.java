package Clase;

import java.util.HashSet;
import java.util.Set;

public class AConocimiento {
    private String nombre;
    private Set<Departmento> departmentos;

    public AConocimiento(String nombre) {
        this.nombre = nombre;
        this.departmentos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Departmento> getDepartmentos() {
        return departmentos;
    }

    public void setDepartmentos(Set<Departmento> departmentos) {
        this.departmentos = departmentos;
    }
    public void addDep(Departmento dep) {
        this.departmentos.add(dep);
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
