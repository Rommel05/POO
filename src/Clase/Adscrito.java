package Clase;

public class Adscrito {
    private Professor prof;
    private Catedra catedra;
    private String fecha;

    public Adscrito(Professor prof, Catedra catedra, String fecha) {
        this.prof = prof;
        this.catedra = catedra;
        this.fecha = fecha;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return this.fecha;
    }
}
