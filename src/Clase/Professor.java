package Clase;

import java.util.HashSet;
import java.util.Set;

public class Professor {
    private int numProf;
    private Departmento dep;
    private Set<Adscrito> adscritos;

    public Professor(int numProf, Departmento dep) {
        this.numProf = numProf;
        this.dep = dep;
        this.adscritos = new HashSet<>();
    }

    public Set<Adscrito> getAdscritos() {
        return adscritos;
    }

    public void setAdscritos(Set<Adscrito> adscritos) {
        this.adscritos = adscritos;
    }
    public void addAdscritos(Adscrito adscrito) {
        this.adscritos.add(adscrito);
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
