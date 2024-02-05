package Clase;

import java.util.HashSet;
import java.util.Set;

public class Catedra {
    private String nombre;
    private Departmento dep;
    private Facultad facultad;
    private Set<Adscrito> adscritos;

    public Catedra(String nombre, Departmento dep, Facultad facultad) {
        this.nombre = nombre;
        this.dep = dep;
        this.facultad = facultad;
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
