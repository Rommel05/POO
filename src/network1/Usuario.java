package network1;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private static int cuenta = 0;
    private int id;
    private String nombre;
    private Set<Publicacion> publicaciones = new HashSet<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.id = cuenta++;
        this.publicaciones = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Set<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    public void addPublicacion(Publicacion publicacion) {
        this.publicaciones.add(publicacion);
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
