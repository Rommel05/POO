package proyecto;

public abstract class Trabajadores {
    private String nombre;
    private String dni;

    public Trabajadores(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public abstract void puesto();
    public abstract void salario();
    public abstract void funcion();

    @Override
    public String toString() {
        return this.nombre;
    }
}
