package Clase;

public class Catedra {
    private String nombre;
    private Departmento dep;
    private Facultad facultad;

    public Catedra(String nombre, Departmento dep, Facultad facultad) {
        this.nombre = nombre;
        this.dep = dep;
        this.facultad = facultad;
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
}
