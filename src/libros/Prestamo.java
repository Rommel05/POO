package libros;

public class Prestamo {
    private Ejemplar ejemplar;
    private Lector lector;
    private String data_p;

    public Prestamo(Ejemplar ejemplar, Lector lector, String data_p) {
        this.ejemplar = ejemplar;
        this.lector = lector;
        this.data_p = data_p;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public String getData_p() {
        return data_p;
    }

    public void setData_p(String data_p) {
        this.data_p = data_p;
    }

    @Override
    public String toString() {
        return this.data_p;
    }
}
