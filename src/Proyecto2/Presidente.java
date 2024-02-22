package Proyecto2;

import java.util.HashSet;
import java.util.Set;

public class Presidente extends FuncionesPresidenciales{
    private Set<AssistentePresidencia> assistentesPresidencia;
    private Set<Administrativo> administrativos;
    private Set<GerenteVentas> gerentesVentas;
    public Presidente(String nombre, String dni){
        super(nombre, dni);
        this.assistentesPresidencia = new HashSet<>();
        this.administrativos = new HashSet<>();
        this.gerentesVentas = new HashSet<>();
    }

    public Set<GerenteVentas> getGerentesVentas() {
        return gerentesVentas;
    }

    public void setGerentesVentas(Set<GerenteVentas> gerentesVentas) {
        this.gerentesVentas = gerentesVentas;
    }

    public void addGerentesVentas(GerenteVentas gerente) {
        this.gerentesVentas.add(gerente);
    }

    public Set<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(Set<Administrativo> administrativos) {
        this.administrativos = administrativos;
    }
    public void AddAdministrativos(Administrativo admin) {
        this.administrativos.add(admin);
    }

    public Set<AssistentePresidencia> getAssistentesPresidencia() {
        return assistentesPresidencia;
    }

    public void setAssistentesPresidencia(Set<AssistentePresidencia> assistentesPresidencia) {
        this.assistentesPresidencia = assistentesPresidencia;
    }
    public void addAsistentes(AssistentePresidencia assistente) {
        this.assistentesPresidencia.add(assistente);
    }

    @Override
    public void funcion() {
        System.out.println("Me encargo que la empresa vaya por buen camino");
    }

    @Override
    public void salario() {
        System.out.println("Mi salario es de 10.000 euros al mes");
    }

    @Override
    public void puesto() {
        System.out.println("Soy el dueño de la empresa");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
