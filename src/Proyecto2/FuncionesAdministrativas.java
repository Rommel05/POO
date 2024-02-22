package Proyecto2;

public abstract class FuncionesAdministrativas extends Trabajadores{
    public FuncionesAdministrativas(String nombre, String dni) {
        super(nombre,dni);
    }
    public abstract void puesto();
    public abstract void salario();
    public abstract void funcion();

    @Override
    public String toString() {
        return super.toString();
    }
}
