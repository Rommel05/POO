package network;

public class Publicacion {
    private String id;
    private String autor;
    private String marcaTemporal;
    private int likes;

    public Publicacion(String id, String autor, String marcaTemporal, int likes) {
        this.id = id;
        this.autor = autor;
        this.marcaTemporal = marcaTemporal;
        this.likes = likes;
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
}
