package network;

import java.util.HashSet;
import java.util.Set;

public class Publicacion {
    private String id;
    private String autor;
    private String marcaTemporal;
    private int likes;
    private Set<Mensaje> mensajes;
    private Set<Foto> fotos;

    public Publicacion(String id, String autor, String marcaTemporal, int likes) {
        this.id = id;
        this.autor = autor;
        this.marcaTemporal = marcaTemporal;
        this.likes = likes;
    }

    public Publicacion() {
        this.mensajes = new HashSet<>();
        this.fotos = new HashSet<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMarcaTemporal() {
        return marcaTemporal;
    }

    public void setMarcaTemporal(String marcaTemporal) {
        this.marcaTemporal = marcaTemporal;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Set<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(Set<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public Set<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(Set<Foto> fotos) {
        this.fotos = fotos;
    }

}
