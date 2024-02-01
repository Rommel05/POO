package Clase;

import java.util.HashSet;
import java.util.Set;

public class Professor {
    private int numProf;
    private Departmento dep;
    private Set<Catedra> catedras;

    public Professor(int numProf, Departmento dep) {
        this.numProf = numProf;
        this.dep = dep;
        this.catedras = new HashSet<>();
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

    public int getNumProf() {
        return numProf;
    }

    public void setNumProf(int numProf) {
        this.numProf = numProf;
    }

    public Departmento getDep() {
        return dep;
    }

    public void setDep(Departmento dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return this.numProf + "";
    }
}
