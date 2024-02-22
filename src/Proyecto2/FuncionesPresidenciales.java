package Proyecto2;

public abstract class FuncionesPresidenciales extends Trabajadores{
    public FuncionesPresidenciales(String nombre, String dni){
        super(nombre, dni);
    }
    public abstract void puesto();
    public abstract void salario();
    public abstract void funcion();

    @Override
    public String toString() {
        return super.toString();
    }
}
