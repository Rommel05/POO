package proyecto;

public class Administrativos extends Trabajadores{
    private Dueño dueño;
    public Administrativos(String nombre, String dni, Dueño dueño) {
        super(nombre, dni);
        this.dueño = dueño;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
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
