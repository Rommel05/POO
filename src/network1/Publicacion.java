package network1;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public abstract class Publicacion {
    private static int cuenta = 0;
    private int id;
    private Date marcaTemporal;
    private int likes;
    private Usuario usuario;
    private Set<Comentario> comentarios;

    public Publicacion(Usuario usuario) {
        this.usuario = usuario;
        this.likes = 0;
        this.marcaTemporal = new Date();
        this.id = cuenta++;
        this.comentarios = new HashSet<>();
    }

    public Set<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(Set<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    public void addComent(Comentario com) {
        this.comentarios.add(com);
    }
    private void like() {
        this.likes++;
    }
    @Override
    public String toString() {
        return this.id + " " + this.likes + " " + this.marcaTemporal + " " + this.usuario;
    }
}
