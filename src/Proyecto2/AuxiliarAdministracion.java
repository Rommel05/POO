package Proyecto2;

public class AuxiliarAdministracion extends FuncionesAdministrativas{
    private Administrativo administrativo;
    public AuxiliarAdministracion(String nombre, String dni, Administrativo administrativo) {
        super(nombre, dni);
        this.administrativo = administrativo;
    }

    public Administrativo getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(Administrativo administrativo) {
        this.administrativo = administrativo;
    }

    @Override
    public void puesto() {
        System.out.println("Soy auxiliar administrativo");
    }

    @Override
    public void salario() {
        System.out.println("Mi salario es de 1500 euros");
    }

    @Override
    public void funcion() {
        System.out.println("Mi trabajo es ayudar a los administrativos");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
