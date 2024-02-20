package proyecto;

import java.util.HashSet;
import java.util.Set;

public class Dueño extends Trabajadores{
    private Set<AssistentePresidencia> asistentes;
    private Set<Administrativos> administrativos;
    public Dueño(String nombre, String dni) {
        super(nombre, dni);
        this.asistentes = new HashSet<>();
        this.administrativos = new HashSet<>();
    }

    public Set<Administrativos> getAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(Set<Administrativos> administrativos) {
        this.administrativos = administrativos;
    }
    public void addAdministrativos(Administrativos admin) {
        this.administrativos.add(admin);
    }

    public Set<AssistentePresidencia> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(Set<AssistentePresidencia> asistentes) {
        this.asistentes = asistentes;
    }
    public void addAsistentes(AssistentePresidencia asistente) {
        this.asistentes.add(asistente);
    }

    @Override
    public void puesto() {
        System.out.println("Soy el dueño de la empresa");
    }

    @Override
    public void salario() {
        System.out.println("Mi salario es de 10.000 euros al mes");

    }

    @Override
    public void funcion() {
        System.out.println("Me encargo que la empresa vaya por buen camino");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
