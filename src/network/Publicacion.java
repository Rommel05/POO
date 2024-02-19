package network;

public class Publicacion {
    private String id;
    private String autor;

    public Publicacion(String id, String autor) {
        this.id = id;
        this.autor = autor;
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
}
