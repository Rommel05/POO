package libros;

public class Historico {
    private String fecha_p;
    private String fecha_t;
    private Lector lector;
    private Ejemplar ejemplar;

    public Historico(String fecha_p, String fecha_t, Lector lector, Ejemplar ejemplar) {
        this.fecha_p = fecha_p;
        this.fecha_t = fecha_t;
        this.lector = lector;
        this.ejemplar = ejemplar;
    }

    public String getFecha_p() {
        return fecha_p;
    }

    public void setFecha_p(String fecha_p) {
        this.fecha_p = fecha_p;
    }

    public String getFecha_t() {
        return fecha_t;
    }

    public void setFecha_t(String fecha_t) {
        this.fecha_t = fecha_t;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    @Override
    public String toString() {
        return this.fecha_p + " - " + this.fecha_t;
    }
}
