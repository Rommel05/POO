package Clase;

import java.util.HashSet;
import java.util.Set;

public class Departmento {
    private int numDep;
    private String nombre;
    private AConocimiento area;
    private Set<Catedra> catedras;
    private Set<Professor> professores;

    public Departmento(int numDep, String nombre, AConocimiento area) {
        this.numDep = numDep;
        this.nombre = nombre;
        this.area = area;
        this.catedras = new HashSet<>();
        this.professores = new HashSet<>();
    }

    public Set<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(Set<Professor> professores) {
        this.professores = professores;
    }
    public void addProfesores(Professor profe) {
        this.professores.add(profe);
    }
    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }
    public void addCatedras(Catedra catedra) {
        this.catedras.add(catedra);
    }
    public int getNumDep() {
        return numDep;
    }

    public void setNumDep(int numDep) {
        this.numDep = numDep;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AConocimiento getArea() {
        return area;
    }

    public void setArea(AConocimiento area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return this.nombre + " - " + getNumDep();
    }
}
