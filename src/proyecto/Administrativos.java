package proyecto;

public class Administrativos extends Trabajadores{
    public Administrativos(String nombre, String dni) {
        super(nombre, dni);
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
