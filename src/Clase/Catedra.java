package Clase;

import java.util.HashSet;
import java.util.Set;

public class Catedra {
    private String nombre;
    private Departmento dep;
    private Facultad facultad;
    private Set<Professor> professores;

    public Catedra(String nombre, Departmento dep, Facultad facultad) {
        this.nombre = nombre;
        this.dep = dep;
        this.facultad = facultad;
        this.professores = new HashSet<>();
    }

    public Set<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(Set<Professor> professores) {
        this.professores = professores;
    }
    public void addProfe(Professor profe) {
        this.professores.add(profe);
    }
    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departmento getDep() {
        return dep;
    }

    public void setDep(Departmento dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
