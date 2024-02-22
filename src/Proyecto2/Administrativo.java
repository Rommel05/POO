package Proyecto2;

import java.util.HashSet;
import java.util.Set;

public class Administrativo extends FuncionesAdministrativas{
    private Presidente presidente;
    private Set<AuxiliarAdministracion> auxiliaresAdministracion;
    public Administrativo(String nombre, String dni, Presidente presidente) {
        super(nombre, dni);
        this.presidente = presidente;
        auxiliaresAdministracion = new HashSet<>();
    }

    public Set<AuxiliarAdministracion> getAuxiliaresAdministracion() {
        return auxiliaresAdministracion;
    }

    public void setAuxiliaresAdministracion(Set<AuxiliarAdministracion> auxiliaresAdministracion) {
        this.auxiliaresAdministracion = auxiliaresAdministracion;
    }
    public void addAuxiliares(AuxiliarAdministracion auxiliares) {
        this.auxiliaresAdministracion.add(auxiliares);
    }
    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    @Override
    public void puesto() {
        System.out.println("Soy adminsitrativo");
    }

    @Override
    public void salario() {
        System.out.println("Mi salario es de 2.500 euros al mes");
    }

    @Override
    public void funcion() {
        System.out.println("Me encargo de las tareas administrativas de la empresa");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
